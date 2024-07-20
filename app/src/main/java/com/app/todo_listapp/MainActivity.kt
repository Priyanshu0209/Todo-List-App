package com.app.todo_listapp

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.app.todo_listapp.presentation.nvgraph.NavGraph
import com.app.todo_listapp.presentation.nvgraph.Route
import com.app.todo_listapp.ui.theme.TodoListAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT,
                Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            TodoListAppTheme {
                val navController = rememberNavController()
                NavGraph(
                    navController = navController,
                    startDestination = Route.NotesScreen.route
                )
            }
        }
    }

}