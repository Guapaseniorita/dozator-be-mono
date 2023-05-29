package io.dozator.domain.content

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContentRepository: JpaRepository<Content, String> {

    fun findByType(type: ContentType): Content?

    fun deleteByType(type: ContentType): Int

}