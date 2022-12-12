package com.example.mynotes.damain.usecase

import com.example.mynotes.damain.model.Note
import com.example.mynotes.damain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}