package com.gunder.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gunder.state.ui.home.HomeScreen
import com.gunder.state.ui.login.LoginScreen
import com.gunder.state.ui.theme.StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateTheme {
//                navController
                val navController = rememberNavController()
//                navHost
                NavHost(navController = navController, startDestination = "login") {
//                    navGraph
                    composable("login") { LoginScreen(navController) }
                    composable("home"){ HomeScreen(navController)}
                }
            }
        }
    }
}

