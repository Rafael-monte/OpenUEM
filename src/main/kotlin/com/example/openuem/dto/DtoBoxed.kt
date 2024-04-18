package com.example.openuem.dto

interface DtoBoxed<Self, Model> {
    fun box(inputModel: Model): Self
    fun unbox(): Model
}