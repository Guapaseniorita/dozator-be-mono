package io.dozator.common.utils.pagination

import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort

class OffsetPageable(
    private val limit: Int = 20,
    private val offset: Int = 0,
    private val sort: Sort = Sort.unsorted()
) : Pageable {

    override fun getPageSize(): Int {
        return limit
    }

    init {
        require(limit >= 1) { "Limit must not be less than one!" }
        require(offset >= 0) { "Offset index must not be less than zero!" }
    }

    // Constructor could be expanded if sorting is needed
    override fun getSort(): Sort {
        return sort
    }

    override fun getPageNumber(): Int {
        return offset / limit
    }

    override fun getOffset(): Long {
        return offset.toLong()
    }

    override operator fun next(): Pageable {
        // Typecast possible because number of entries cannot be bigger than integer (primary key is integer)
        return OffsetPageable(this.limit, (getOffset() + this.limit).toInt(), sort)
    }

    fun previous(): Pageable {
        // The integers are positive. Subtracting does not let them become bigger than integer.
        return if (hasPrevious()) OffsetPageable(this.limit, (getOffset() - this.limit).toInt(), sort) else this
    }

    override fun previousOrFirst(): Pageable {
        return if (hasPrevious()) previous() else first()
    }

    override fun first(): Pageable {
        return OffsetPageable(this.limit, 0, sort)
    }

    override fun withPage(pageNumber: Int): Pageable {
        return OffsetPageable(pageNumber, pageSize, getSort())
    }

    override fun hasPrevious(): Boolean {
        return offset > this.limit
    }

    companion object {
        fun of(limit: Int?, offset: Int?, sort: Sort = Sort.unsorted()): OffsetPageable {
            return OffsetPageable(limit ?: 20, offset ?: 0, sort)
        }
    }
}
