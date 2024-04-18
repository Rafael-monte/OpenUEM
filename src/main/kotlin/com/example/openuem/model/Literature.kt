package com.example.openuem.model

import jakarta.persistence.*

@Entity
@Table(name="literature")
class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="uuid")
    lateinit var uuid: String

    @Column(name="name")
    lateinit var name: String

    @Column(name="year")
    var publicationYear: Int = 0

    @Column(name="author")
    lateinit var author: String

    @Column(name="edition")
    lateinit var edition: String

    @ManyToMany
    lateinit var subjects: Set<Subject>
}