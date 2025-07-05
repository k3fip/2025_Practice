package com.example.meditationapplication.screens

import android.media.MediaPlayer
import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.room.parser.expansion.ExpandableSection

import androidx.room.processor.Context
import com.example.meditationapplication.R
import com.example.meditationapplication.ui.theme.Gray30
import com.example.meditationapplication.ui.theme.Gray40
import java.nio.file.WatchEvent
import java.time.format.TextStyle

@Composable
//navController: NavController, name: String
fun MusicPlayer(navController: NavController, name: String) {
    var isPlaying = remember {
        mutableStateOf(false)
    }
    val mContext = LocalContext.current
    val mMediaPlayer = MediaPlayer.create(mContext, R.raw.audio)
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
            painter = painterResource(R.drawable.art_sircle),
            contentDescription = "art",
            modifier = Modifier.size(250.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Painting Forest",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                modifier = Modifier.padding(bottom = 15.dp)
            )
            Text(
                text = "By: Painting with Passion",
                fontFamily = FontFamily.Serif,
                fontSize = 25.sp,
                color = Gray40
            )
        }
        Image(
            painter = painterResource(R.drawable.time_bar),
            contentDescription = "time",
            modifier = Modifier
                .fillMaxWidth()
                .size(50.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = {

                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.split),
                    contentDescription = "split",
                    modifier = Modifier.size(15.dp)
                )
            }
            IconButton(
                onClick = {

                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.prev),
                    contentDescription = "prev",
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(
                onClick = {
                    if (!isPlaying.value) {
                        mMediaPlayer.start()
                    } else {
                        mMediaPlayer.pause()
                    }
                    isPlaying.value = !isPlaying.value
                },
            ) {
                Image(
                    painter = painterResource(R.drawable.play_green),
                    contentDescription = "play",
                    modifier = Modifier.size(100.dp)
                )
            }
            IconButton(
                onClick = {

                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.next),
                    contentDescription = "next",
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(
                onClick = {

                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.repeat),
                    contentDescription = "repeat",
                    modifier = Modifier.size(15.dp)
                )
            }
        }
    }
    NavigationBoard(navController, name)
}