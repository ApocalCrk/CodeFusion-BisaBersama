package com.example.bisabersama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bisabersama.screens.LoginPage
import com.example.bisabersama.screens.RegisterPage
import com.example.bisabersama.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splashScreen", builder = {
              composable("splashScreen"){
                  SplashScreen(navController)
              }
                composable("loginScreen"){
                    LoginPage(navController = navController)
                }
                composable("registerScreen"){
                    RegisterPage(navController = navController)
                }
            })
        }
    }
}
