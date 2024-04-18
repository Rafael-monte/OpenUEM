package com.example.openuem.repositories

import com.example.openuem.model.Course
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface CourseRepository: JpaRepository<Course, String> {
    fun findCourseByCode(code: String): Optional<Course>
}