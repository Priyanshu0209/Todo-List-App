package com.app.todo_listapp.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao
interface NotesDao{

    @Query("SELECT * from notesentity")
    suspend fun getAllNotes() : Flow<List<NotesEntity>>

    @Upsert
    suspend fun addNote(note : NotesEntity)






}