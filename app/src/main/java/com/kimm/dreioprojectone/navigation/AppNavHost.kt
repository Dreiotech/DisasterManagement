package com.kimm.dreioprojectone.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kimm.dreioprojectone.ui.theme.Disaster.DisasterColumn
import com.kimm.dreioprojectone.ui.theme.screens.Help.HelpScreen
import com.kimm.dreioprojectone.ui.theme.screens.Home.HomeScreen
import com.kimm.dreioprojectone.ui.theme.screens.Login.AdminScreen

import com.kimm.dreioprojectone.ui.theme.screens.Login.LoginScreen
import com.kimm.dreioprojectone.ui.theme.screens.Login.ManagementScreen
import com.kimm.dreioprojectone.ui.theme.screens.Register.RegisterScreen
import com.kimm.dreioprojectone.ui.theme.screens.Solutions.SolutionColumn
import com.kimm.dreioprojectone.ui.theme.screens.Updates.UpdateScreen
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
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_HELP){
            HelpScreen()
        }
        composable(ROUTE_SOLUTION){
            SolutionColumn()
        }
        composable(ROUTE_ADMIN){
            AdminScreen()
        }
        composable(ROUTE_UPDATES){
            UpdateScreen()
        }
        composable(ROUTE_DISASTER){
            DisasterColumn()
        }
        composable(ROUTE_MANAGEMENT){
            ManagementScreen()
        }


            }
        }


