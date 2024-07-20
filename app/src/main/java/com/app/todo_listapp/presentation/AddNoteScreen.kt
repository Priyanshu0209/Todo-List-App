package com.app.todo_listapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.todo_listapp.ui.theme.SystemBackgroundColor


@Composable
fun AddNoteScreen(){

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {

        },
        containerColor = SystemBackgroundColor,

    ){paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ){

        }
    }






}