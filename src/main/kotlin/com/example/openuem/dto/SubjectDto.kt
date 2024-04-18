package com.example.openuem.dto

import com.example.openuem.model.Course
import com.example.openuem.model.Literature
import com.example.openuem.model.Subject

class SubjectDto: DtoBoxed<SubjectDto, Subject> {
    lateinit var name: String
    lateinit var code: String
    lateinit var objective: String;
    var expectedYear: Int = 1
    lateinit var literatures: Set<String>
    lateinit var courses: Set<String>

    override fun box(inputModel: Subject): SubjectDto {
        return SubjectDto().apply {
            this.code = inputModel.code
            this.name = inputModel.name
            this.objective = inputModel.objective
            this.expectedYear = inputModel.expectedYear
            this.literatures = this.formatLiteratures(inputModel.literatures)
            this.courses = this.formatCourses(inputModel.courses)
        }
    }

    override fun unbox(): Subject {
        return Subject().apply{
            this.code = this@SubjectDto.code
            this.name = this@SubjectDto.name
            this.objective = this@SubjectDto.objective
            this.expectedYear = this@SubjectDto.expectedYear
        }
    }

    private fun formatCourses(courses: Set<Course>): Set<String> = courses.map{"${it.code} - ${it.name}"}.toSet()

    private fun formatLiteratures(literatures: Set<Literature>): Set<String> {
        return literatures.map{literature ->
            """
                ${literature.author}, ${literature.name}. ${literature.publicationYear}, ${literature.edition}.
            """.trimIndent()
        }.toSet()
    }
}