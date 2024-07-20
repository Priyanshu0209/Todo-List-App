package com.app.todo_listapp.presentation.notescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.todo_listapp.ui.theme.nunito_regular


@Composable
fun Note(
    title: String,
    color: Color
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = color
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
    ) {
        Text(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp),
            text = title,
            fontSize = 20.sp,
            fontFamily = nunito_regular,
            color = Color.Black
        )
    }


}