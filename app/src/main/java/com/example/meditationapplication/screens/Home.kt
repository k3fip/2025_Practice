package com.example.meditationapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditationapplication.R
import com.example.meditationapplication.ui.theme.Gray30
import com.example.meditationapplication.ui.theme.Gray40
import com.example.meditationapplication.ui.theme.Green40
import com.example.meditationapplication.ui.theme.GreenText


@Composable
fun Home(navController: NavController, name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(start = 18.dp, top = 75.dp, end = 18.dp, bottom = 115.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()
        Column {
            Text(
                text = "Hello, $name!",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif
                )
            )
            Text(
                text = "How are you feeling today?",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Serif,
                    color = Gray40
                ),
                modifier = Modifier.padding(top = 5.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(65.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.rect),
                        contentDescription = "rect",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )
                    Image(
                        painter = painterResource(R.drawable.calm),
                        contentDescription = "calm",
                        modifier = Modifier.size(35.dp)
                    )
                }
                Text(
                    text = "Calm",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(65.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.rect),
                        contentDescription = "rect",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )
                    Image(
                        painter = painterResource(R.drawable.relax),
                        contentDescription = "relax",
                        modifier = Modifier.size(35.dp)
                    )
                }
                Text(
                    text = "Relax",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(65.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.rect),
                        contentDescription = "rect",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )
                    Image(
                        painter = painterResource(R.drawable.focus),
                        contentDescription = "focus",
                        modifier = Modifier.size(35.dp)
                    )
                }
                Text(
                    text = "Focus",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(65.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.rect),
                        contentDescription = "rect",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )
                    Image(
                        painter = painterResource(R.drawable.spiral),
                        contentDescription = "spiral",
                        modifier = Modifier.size(35.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(
                    text = "Anxious",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )
            }
        }
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Gray30)
        ) {
            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.6f),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Meditation 101",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif,
                            fontSize = 25.sp,
                            color = GreenText
                        )
                    )
                    Text(
                        text = "Techniques, Benefits, and a Beginner’s How-To",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Gray
                        ),
                        modifier = Modifier.padding(top = 5.dp)
                    )
                    MyButton()
                }
                Image(
                    painter = painterResource(R.drawable.girl_chill),
                    contentDescription = "girl_chill",
                    modifier = Modifier.size(111.dp)
                )
            }
        }
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Gray30)
        ) {
            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.7f),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Cardio Meditation",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif,
                            fontSize = 25.sp,
                            color = GreenText
                        )
                    )
                    Text(
                        text = "Basics of Yoga for Beginners or Experienced Professionals",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Gray
                        ),
                        modifier = Modifier.padding(top = 5.dp)
                    )
                    MyButton()
                }
                Image(
                    painter = painterResource(R.drawable.apple),
                    contentDescription = "apple",
                    modifier = Modifier.size(111.dp)
                )
            }
        }
    }
    NavigationBoard(navController, name)
}

@Composable
fun MyButton() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(top = 7.dp)
    ) {
        Button(
            onClick = {

            },
            modifier = Modifier
                .size(width = 138.dp, height = 39.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green40),
        ) {
            Text(
                text = "watch now",
                fontFamily = FontFamily.Serif,
                fontSize = 12.sp
            )
            Icon(
                painter = painterResource(R.drawable.play),
                contentDescription = "play",
                modifier = Modifier.size(13.dp)
            )
        }
    }
}

