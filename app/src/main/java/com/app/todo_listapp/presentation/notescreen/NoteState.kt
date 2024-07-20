package com.app.todo_listapp.presentation.notescreen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.app.todo_listapp.data.local.NotesEntity


data class NoteState(
    val title : MutableState<String> = mutableStateOf(""),
    val description : MutableState<String> = mutableStateOf(""),
    val notes : List<NotesEntity> = emptyList()
)