package com.example.mynotes.damain.usecase

import com.example.mynotes.damain.model.Note
import com.example.mynotes.damain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun addNote(note: Note) = noteRepository.addNote(note)
}