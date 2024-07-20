package com.app.todo_listapp.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.todo_listapp.presentation.AddNoteScreen
import com.app.todo_listapp.presentation.notescreen.NotesScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String
) {

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(route = Route.NotesScreen.route) {
            NotesScreen(
                onClick = {
                    navController.navigate(Route.AddNotesScreen.route)
                }
            )
        }

        composable(route = Route.AddNotesScreen.route) {
            AddNoteScreen(
                onBackClick = {
                    navController.navigateUp()
                }
            )
        }


    }


}