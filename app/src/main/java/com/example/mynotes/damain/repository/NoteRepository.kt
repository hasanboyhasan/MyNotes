package com.example.mynotes.damain.repository

import com.example.mynotes.core.Resource
import com.example.mynotes.damain.model.Note
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun addNote(note: Note): Flow<Resource<Unit>>

    fun deleteNote(note: Note): Flow<Resource<Unit>>

    fun editNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>
}