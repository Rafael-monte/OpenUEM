package com.example.openuem.repositories

import com.example.openuem.model.Course
import com.example.openuem.model.Subject
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface SubjectRepository: JpaRepository<Subject, String> {
    fun findSubjectByCode(code: String): Optional<Subject>
    fun findSubjectsByCourses(courses: Set<Course>): Set<Subject>
}