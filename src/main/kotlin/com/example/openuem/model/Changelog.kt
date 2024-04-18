package com.example.openuem.model

import jakarta.persistence.*
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@Entity
@Table(name="changelog")
class Changelog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="uuid")
    lateinit var uuid: String;

    @Column(name="change_date")
    lateinit var changeDate: LocalDateTime

    @Lob
    @Column(name="changes")
    lateinit var changes: String

    @Column(name="made_by", unique = true)
    lateinit var madeBy: String
}
