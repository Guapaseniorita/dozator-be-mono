package io.dozator.domain.content

import io.dozator.domain.AbstractEntity
import io.dozator.domain.WithIdGenerator
import io.dozator.domain.generateId
import jakarta.persistence.*

@Entity
class Content : AbstractEntity(), WithIdGenerator {

    @Id
    override var id: String = generateId()

    @Column(name = "type", unique = true)
    @Enumerated(EnumType.STRING)
    lateinit var type: ContentType

    @Column(name = "value", columnDefinition="TEXT")
    lateinit var value: String

}

enum class ContentType {
    MENU,
    PAGE,
    MODAL,
    CONTRAINDICATION
}