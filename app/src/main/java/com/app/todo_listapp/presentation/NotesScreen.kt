package com.app.todo_listapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.todo_listapp.R
import com.app.todo_listapp.ui.theme.IconButtonColor
import com.app.todo_listapp.ui.theme.SystemBackgroundColor
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
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            modifier = Modifier
                                .background(color = IconButtonColor, shape = RoundedCornerShape(10.dp)),
                            onClick = {
                                //Todo
                            },
                            colors = IconButtonDefaults.iconButtonColors(containerColor = IconButtonColor)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        IconButton(
                            modifier = Modifier
                                .background(color = IconButtonColor, shape = RoundedCornerShape(10.dp))
                            ,
                            onClick = {
                                //Todo
                            },
                            colors = IconButtonDefaults.iconButtonColors(containerColor = IconButtonColor)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.info),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                },
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

            ) {

        }

    }


}