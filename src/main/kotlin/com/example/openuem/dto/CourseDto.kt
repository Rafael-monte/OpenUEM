package com.example.openuem.dto

import com.example.openuem.model.Course
import com.example.openuem.model.Subject

class CourseDto: DtoBoxed<CourseDto, Course> {
    lateinit var code: String

    lateinit var name: String

    var minimumTime: Int = 1

    var maximumTime: Int = 10

    lateinit var subjects: Set<String>

    override fun box(inputModel: Course): CourseDto {
        return CourseDto().apply {
            this.code = inputModel.code
            this.name = inputModel.name
            this.minimumTime = inputModel.minimumTime
            this.maximumTime = inputModel.maximumTime
            this.subjects = this.formatSubjects(inputModel.subjects)
        }
    }

    override fun unbox(): Course {
        return Course().apply {
            this.code = this@CourseDto.code
            this.name = this@CourseDto.name
            this.minimumTime = this@CourseDto.minimumTime
            this.maximumTime = this@CourseDto.maximumTime
        }
    }

    private fun formatSubjects(subjects: Set<Subject>): Set<String> {
        return subjects.map{subject ->
            "${subject.code} - ${subject.name}"
        }.toSet();
    }


}