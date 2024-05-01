package com.kimm.dreioprojectone.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kimm.dreioprojectone.ui.theme.screens.Login.LoginScreen
import com.kimm.dreioprojectone.ui.theme.screens.Register.RegisterScreen
import com.kimm.dreioprojectone.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
    }

}