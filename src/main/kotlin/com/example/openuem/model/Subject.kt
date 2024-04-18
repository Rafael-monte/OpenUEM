package com.example.openuem.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.Lob
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name="subject")
class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="uuid")
    lateinit var uuid: String

    @Column(name="name")
    lateinit var name: String

    @Column(name="code", unique = true)
    lateinit var code: String

    @Lob
    @Column(name="objective")
    lateinit var objective: String;

    @Column(name="expected_year")
    var expectedYear: Int = 1

    @ManyToMany
    lateinit var courses: Set<Course>

    @ManyToMany
    lateinit var literatures: Set<Literature>
}