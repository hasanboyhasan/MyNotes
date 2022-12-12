package com.example.mynotes.presentation.fragment.note

import com.example.mynotes.core.BaseViewModel
import com.example.mynotes.core.UIState
import com.example.mynotes.damain.model.Note
import com.example.mynotes.damain.usecase.DeleteNoteUseCase
import com.example.mynotes.damain.usecase.GeAllNotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class NoteListViewModel @Inject constructor(
    private val getAllNotesUseCase: GeAllNotesUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : BaseViewModel() {

    private val _deleteNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val deleteNoteState = _deleteNoteState.asStateFlow()

    private val _getAllNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getAllNotesState = _getAllNotesState.asStateFlow()


    fun deleteNote(note: Note) {
        deleteNoteUseCase.deleteNote(note).collectData(_deleteNoteState)
    }

    fun getAllNotes() {
        getAllNotesUseCase.getAllNotes().collectData(_getAllNotesState)
    }
}