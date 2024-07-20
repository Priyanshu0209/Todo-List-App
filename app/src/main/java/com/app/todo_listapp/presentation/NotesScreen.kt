package com.app.todo_listapp.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.app.todo_listapp.ui.theme.SystemBackgroundColor
import com.app.todo_listapp.ui.theme.nunito_regular
import com.app.todo_listapp.ui.theme.nunito_semibold


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesScreen() {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Todo List",
                        fontFamily = nunito_semibold,
                        fontSize = 30.sp,
                        color = Color.White
                    )
                },

                colors = TopAppBarDefaults.topAppBarColors(containerColor = SystemBackgroundColor),
                modifier = Modifier
                    .fillMaxWidth(),
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Check, contentDescription = null)
                },
                actions = {},
                scrollBehavior = null
            )
        },
        floatingActionButton = {

        },
        floatingActionButtonPosition = FabPosition.End,
        containerColor = SystemBackgroundColor,
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),

        ){

        }

    }


}