package com.app.todo_listapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.todo_listapp.data.local.NotesDatabase
import com.app.todo_listapp.data.local.NotesEntity
import com.app.todo_listapp.presentation.notescreen.NoteEvent
import com.app.todo_listapp.presentation.notescreen.NoteState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val notesDatabase: NotesDatabase
) : ViewModel() {

    val notesList = notesDatabase.notesDao.getAllNotes().stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(),
        emptyList()
    )

    val _state = MutableStateFlow(NoteState())

    val state = combine(notesList,_state){notesList , state ->
        state.copy(
            notes = notesList
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), NoteState())

    fun onEvent(event : NoteEvent){
        when(event){
            NoteEvent.SaveNote -> {
                val note = NotesEntity(
                    title = state.value.title.value,
                    description = state.value.description.value,
                    colorId = (1..6).random()
                )
                viewModelScope.launch {
                    notesDatabase.notesDao.addNote(note)
                }
                _state.update {
                    it.copy(
                        title = mutableStateOf(""),
                        description = mutableStateOf("")
                    )
                }
            }
        }
    }


}