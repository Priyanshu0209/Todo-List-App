package com.app.todo_listapp.core

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.app.todo_listapp.ui.theme.noteColor1
import com.app.todo_listapp.ui.theme.noteColor2
import com.app.todo_listapp.ui.theme.noteColor3
import com.app.todo_listapp.ui.theme.noteColor4
import com.app.todo_listapp.ui.theme.noteColor5
import com.app.todo_listapp.ui.theme.noteColor6


fun Modifier.getColor(number: Int): Color {
    val colors = listOf(
        noteColor1,
        noteColor2,
        noteColor3,
        noteColor4,
        noteColor5,
        noteColor6
    )
    return colors[number]
}

