package com.example.openuem.repositories

import com.example.openuem.model.Changelog
import org.springframework.data.jpa.repository.JpaRepository

interface ChangelogRepository: JpaRepository<Changelog, String> {
    fun findAllByOrderByChangeDateDesc(): Set<Changelog>
}