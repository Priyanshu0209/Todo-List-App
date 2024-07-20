package com.app.todo_listapp.presentation.nvgraph


sealed class Route(
    val route: String
) {
    object NotesScreen : Route(route = "NotesScreen")
    object AddNotesScreen : Route(route = "AddNotesScreen")
    object ViewNoteScreen : Route(route = "ViewNoteScreen")


}