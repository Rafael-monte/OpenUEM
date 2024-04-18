package com.example.openuem.model

import jakarta.persistence.*

@Entity
@Table(name="course")
class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="uuid")
    lateinit var uuid: String

    @Column(name="code", unique = true)
    lateinit var code: String

    @Column(name="name")
    lateinit var name: String

    @Column(name="minimum_time")
    var minimumTime: Int = 1

    @Column(name="maximum_time")
    var maximumTime: Int = 10

    @ManyToMany
    lateinit var subjects: Set<Subject>
}