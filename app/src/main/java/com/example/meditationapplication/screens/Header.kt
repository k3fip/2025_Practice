package com.example.meditationapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.meditationapplication.R

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        IconButton(
            onClick = {

            },
        ) {
            Image(
                painter = painterResource(R.drawable.hamburger),
                contentDescription = "hamburger",
                modifier = Modifier.size(22.dp),
                contentScale = ContentScale.Fit

            )
        }
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.size(64.dp)
        )
        IconButton(
            onClick = {

            },
        ) {
            Image(
                painter = painterResource(R.drawable.profile_pic),
                contentDescription = "profile_pic",
                modifier = Modifier
                    .size(35.dp)
                    .fillMaxSize()

            )
        }
    }
}