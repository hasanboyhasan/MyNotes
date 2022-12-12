package com.example.mynotes.presentation.fragment.add

import com.example.mynotes.core.BaseViewModel
import com.example.mynotes.core.UIState
import com.example.mynotes.damain.model.Note
import com.example.mynotes.damain.usecase.AddNoteUseCase
import com.example.mynotes.damain.usecase.EditNoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AddNoteViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase, private val editNoteUseCase: EditNoteUseCase

) : BaseViewModel() {

    private val _addNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val addNoteState = _addNoteState.asStateFlow()

    private val _editNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val editNoteState = _editNoteState.asStateFlow()

    fun editNote(note: Note) {
        editNoteUseCase.editNote(note).collectData(_editNoteState)
    }

    fun addNote(note: Note) {
        addNoteUseCase.addNote(note).collectData(_addNoteState)
    }
}