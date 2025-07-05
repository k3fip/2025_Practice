package com.example.meditationapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.meditationapplication.screens.GreetingScreen
import com.example.meditationapplication.screens.Home
import com.example.meditationapplication.screens.MusicPlayer
import com.example.meditationapplication.screens.Profile
import com.example.meditationapplication.screens.Sounds
import com.example.meditationapplication.ui.theme.MeditationApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "GreetingScreen",
                builder = {
                    composable("GreetingScreen") {
                        GreetingScreen(navController)
                    }
                    composable("Home/{name}") {
                        val name = it.arguments?.getString("name")
                        Home(navController, name ?: "No name")
                    }
                    composable("Sounds/{name}") {
                        val name = it.arguments?.getString("name")
                        Sounds(navController, name ?: "No name")
                    }
                    composable("Profile/{name}") {
                        val name = it.arguments?.getString("name")
                        Profile(navController, name ?: "No name")
                    }
                    composable("MusicPlayer/{name}") {
                        val name = it.arguments?.getString("name")
                        MusicPlayer(navController, name ?: "No name")
                    }
                }
            )

        }
    }
}

