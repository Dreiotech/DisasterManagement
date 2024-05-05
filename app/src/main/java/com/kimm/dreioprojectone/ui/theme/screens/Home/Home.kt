package com.kimm.dreioprojectone.ui.theme.screens.Home


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize




import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorites,
        BottomNavItem.Profile
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
    ) {
        val currentRoute = navController.currentDestination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { item.icon },
                label = { item.label },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

sealed class BottomNavItem(val route: String, val label: @Composable () -> Unit, val icon: @Composable () -> Unit) {
    object Home : BottomNavItem("home", { Text("Home") }, { Icon(Icons.Filled.Home, contentDescription = "Home") })
    object Favorites : BottomNavItem("favorites", { Text("Favorites") }, { Icon(Icons.Filled.Favorite, contentDescription = "Favorites") })
    object Profile : BottomNavItem("profile", { Text("Profile") }, { Icon(Icons.Filled.Person, contentDescription = "Profile") })
}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    Surface(color = Color.White) {
        val navController = rememberNavController()
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            BottomNavigationBar(navController)
        }
    }
}



