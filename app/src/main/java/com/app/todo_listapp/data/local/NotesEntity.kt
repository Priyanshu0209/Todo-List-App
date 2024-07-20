package com.app.todo_listapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class NotesEntity(
    val title : String,
    val description : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 1
)