package com.example.meditationapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditationapplication.Music
import com.example.meditationapplication.R
import com.example.meditationapplication.ui.theme.Gray30
import com.example.meditationapplication.ui.theme.Gray40
import com.example.meditationapplication.ui.theme.Green40
import kotlinx.coroutines.flow.combine
import java.nio.file.WatchEvent


@Composable
//navController: NavController, name: String
fun Sounds(navController: NavController, name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(start = 18.dp, top = 75.dp, end = 18.dp, bottom = 115.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(195.dp)
                .clip(RoundedCornerShape(20.dp))

        ) {
            Box {
                Image(
                    painter = painterResource(R.drawable.layout),
                    contentDescription = "layout",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .fillMaxHeight()
                        .padding(30.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Relax Sounds",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif,
                            fontSize = 27.sp,
                            color = Color.White
                        )
                    )
                    Text(
                        text = "Sometimes the most productive thing you can do is relax.",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif,
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    )
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.padding(top = 7.dp)
                    ) {
                        Button(
                            onClick = {
                                navController.navigate("MusicPlayer/$name")
                            },
                            modifier = Modifier
                                .size(width = 138.dp, height = 39.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        ) {
                            Text(
                                text = "play now",
                                fontFamily = FontFamily.Serif,
                                fontSize = 12.sp,
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(
                listOf(
                    Music(R.drawable.img_1, "Painting Forest", 59899, 20),
                    Music(R.drawable.img_2, "Mountaineers", 45697, 15),
                    Music(R.drawable.img_3, "Lovely Deserts", 9428, 39),
                    Music(R.drawable.img_4, "The Hill Sides", 52599, 50)
                )
            ) { _, item ->
                MusicBrick(item)
            }
        }
    }
    NavigationBoard(navController, name)
}

@Composable
fun MusicBrick(music: Music = Music(R.drawable.img_4, "The Hill Sides", 52599, 50)) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        Image(
            painter = painterResource(id = music.imageId),
            contentDescription = "img_${music.imageId}",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(65.dp)
                .clip(RoundedCornerShape(20.dp))
                .padding(start = 10.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(end = 70.dp)
        ) {
            Text(
                text = music.title,
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            )
            Text(
                text = "${music.listeningTimes} Listening",
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontSize = 12.sp,
                    color = Gray40
                )
            )
        }
        Text(
            text = "${music.time} Min",
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Gray40
            ),
            modifier = Modifier.padding(end = 10.dp)
        )
    }
}