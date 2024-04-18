package com.example.openuem.dto

import com.example.openuem.model.Changelog
import java.time.LocalDateTime

class ChangelogDto: DtoBoxed<ChangelogDto, Changelog> {
    lateinit var changeDate: LocalDateTime
    lateinit var changes: String
    lateinit var madeBy: String

    override fun box(inputModel: Changelog): ChangelogDto {
        return ChangelogDto().apply {
            this.changeDate = inputModel.changeDate
            this.changes = inputModel.changes
            this.madeBy = inputModel.madeBy
        }
    }

    override fun unbox(): Changelog {
        return Changelog().apply {
            this.changeDate = this@ChangelogDto.changeDate
            this.madeBy = this@ChangelogDto.madeBy
            this.changes = this@ChangelogDto.changes
        }
    }
}