package com.example.meditationapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.room.parser.Section
import com.example.meditationapplication.R
import com.example.meditationapplication.ui.theme.Gray40
import com.example.meditationapplication.ui.theme.Green40
import java.nio.file.WatchEvent


@Composable
//navController: NavController, name: String
fun Profile(navController: NavController, name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(start = 18.dp, top = 75.dp, end = 18.dp, bottom = 115.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        Image(
            painter = painterResource(R.drawable.profile_pic),
            contentDescription = "profile",
            modifier = Modifier.size(150.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif
            )
            Text(
                text = "Lucknow, India",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Gray40
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "STATS",
                color = Green40,
                fontFamily = FontFamily.Serif,
                fontSize = 16.sp
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(2.dp)
                    .background(color = Green40)
            )
        }
        Image(
            painter = painterResource(R.drawable.stats),
            contentDescription = "stats",
            modifier = Modifier.size(271.dp)
        )
    }
    NavigationBoard(navController, name)
}