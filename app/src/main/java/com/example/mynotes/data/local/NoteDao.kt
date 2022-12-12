package com.example.mynotes.data.local

import androidx.room.*
import com.example.mynotes.data.model.NoteEntity

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Update
    suspend fun editNote(noteId: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun gAllNotes(): List<NoteEntity>
}