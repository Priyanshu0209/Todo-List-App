package com.app.todo_listapp.data.local

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class NotesEntity(
    val title : String,
    val description : String,
    val colorId : Int = 0,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)