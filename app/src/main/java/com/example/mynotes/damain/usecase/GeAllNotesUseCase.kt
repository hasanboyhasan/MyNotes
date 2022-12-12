package com.example.mynotes.damain.usecase

import com.example.mynotes.damain.repository.NoteRepository
import javax.inject.Inject

class GeAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()
}