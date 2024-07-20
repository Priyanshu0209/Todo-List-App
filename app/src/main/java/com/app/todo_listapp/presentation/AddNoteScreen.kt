package com.app.todo_listapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.todo_listapp.R
import com.app.todo_listapp.ui.theme.IconButtonColor
import com.app.todo_listapp.ui.theme.SystemBackgroundColor
import com.app.todo_listapp.ui.theme.nunito_regular
import com.app.todo_listapp.ui.theme.textHintTitleColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNoteScreen(
    onBackClick: () -> Unit
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    IconButton(
                        modifier = Modifier
                            .background(
                                color = IconButtonColor,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        onClick = onBackClick,
                        colors = IconButtonDefaults.iconButtonColors(containerColor = IconButtonColor)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            modifier = Modifier
                                .background(
                                    color = IconButtonColor,
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            onClick = {
                                //Todo
                            },
                            colors = IconButtonDefaults.iconButtonColors(containerColor = IconButtonColor)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.visibility),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        IconButton(
                            modifier = Modifier
                                .background(
                                    color = IconButtonColor,
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            onClick = {
                                //Todo
                            },
                            colors = IconButtonDefaults.iconButtonColors(containerColor = IconButtonColor)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.save),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SystemBackgroundColor)
            )
        },
        containerColor = SystemBackgroundColor,

        ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            //TODO To be removed
            var title by remember { mutableStateOf("") }
            var description by remember { mutableStateOf("") }
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = title,
                onValueChange = {
                    title = it
                },
                textStyle = TextStyle(
                    fontFamily = nunito_regular,
                    fontSize = 30.sp,
                    color = Color.White
                ),
                label = {
                    Text(
                        text = "Title",
                        color = textHintTitleColor,
                        fontSize = 30.sp
                    )
                },
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = SystemBackgroundColor,
                    unfocusedContainerColor = SystemBackgroundColor,
                    focusedIndicatorColor = SystemBackgroundColor,
                    unfocusedIndicatorColor = SystemBackgroundColor,
                    cursorColor = Color.White
                ),
            )
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = description,
                onValueChange = {
                    description = it
                },
                textStyle = TextStyle(
                    fontFamily = nunito_regular,
                    fontSize = 23.sp,
                    color = Color.White
                ),
                label = {
                    Text(
                        text = "Description...",
                        color = textHintTitleColor,
                        fontSize = 23.sp
                    )
                },
                singleLine = false,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = SystemBackgroundColor,
                    unfocusedContainerColor = SystemBackgroundColor,
                    focusedIndicatorColor = SystemBackgroundColor,
                    unfocusedIndicatorColor = SystemBackgroundColor,
                    cursorColor = Color.White
                ),

                )

        }
    }


}