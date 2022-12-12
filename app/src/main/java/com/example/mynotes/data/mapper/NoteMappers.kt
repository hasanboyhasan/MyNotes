package com.example.mynotes.data.mapper

import com.example.mynotes.data.model.NoteEntity
import com.example.mynotes.damain.model.Note

fun Note.toNoteEntity() = NoteEntity(
    id, title, description, createdAt
)

fun NoteEntity.toNote() = Note(
    id, title, description, createdAt
)