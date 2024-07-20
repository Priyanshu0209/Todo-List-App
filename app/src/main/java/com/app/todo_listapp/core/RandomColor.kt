package com.app.todo_listapp.core

import androidx.compose.ui.graphics.Color


fun Color.randomColor(colors : List<Color>) : Color{
    val random = (0 until colors.size).random()
    return colors[random]
}