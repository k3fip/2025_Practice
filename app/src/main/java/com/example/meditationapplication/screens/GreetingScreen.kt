package com.example.meditationapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.meditationapplication.R
import com.example.meditationapplication.ui.theme.Gray40
import com.example.meditationapplication.ui.theme.Green40

@Composable
//
fun GreetingScreen(navController: NavController) {
    val name = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(R.drawable.bg),
            contentDescription = "background",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(64.dp),

                )
            Text(
                text = "What is your name?",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
            Text(
                text = "Sign up now for starting your meditation.",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Serif,
                    color = Gray40
                ),
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                name.value,
                { name.value = it },
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Gray
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .height(61.dp)
            ) {
                Button(
                    onClick = {
                        navController.navigate("Home/${name.value}")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Green40,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "SIGNUP",
                        style = TextStyle(fontSize = 25.sp)
                    )
                }
            }
        }
    }
}