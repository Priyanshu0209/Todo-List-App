package com.app.todo_listapp.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.todo_listapp.MainViewModel
import com.app.todo_listapp.presentation.AddNoteScreen
import com.app.todo_listapp.presentation.notescreen.NoteEvent
import com.app.todo_listapp.presentation.notescreen.NotesScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    mainViewModel: MainViewModel,
    startDestination: String
) {

    val noteState by mainViewModel.state.collectAsState()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(route = Route.NotesScreen.route) {
            NotesScreen(
                onClick = {
                    navController.navigate(Route.AddNotesScreen.route)
                },
                state = noteState
            )
        }

        composable(route = Route.AddNotesScreen.route) {
            AddNoteScreen(
                onBackClick = {
                    navController.navigateUp()
                },
                state = noteState,
                onSaveClick = { noteEvent ->
                    when (noteEvent) {
                        NoteEvent.SaveNote -> navController.navigateUp()
                        else -> Unit
                    }
                    mainViewModel.onEvent(noteEvent)
                }
            )
        }


    }


}