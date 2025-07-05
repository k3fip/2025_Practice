package com.example.meditationapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.meditationapplication.R

@Composable
fun NavigationBoard(navController: NavController, name: String) {

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp)
        ) {
            IconButton(
                onClick = {
                    navController.navigate("Home/$name")
                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "home",
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate("Sounds/$name")
                },

                ) {
                Icon(
                    painter = painterResource(R.drawable.sounds),
                    contentDescription = "sounds",
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate("Profile/$name")
                },

                ) {
                Icon(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "profile",
                    modifier = Modifier
                        .size(25.dp)
                        .fillMaxSize()
                )
            }
        }
    }
}

