package com.kimm.dreioprojectone.ui.theme.screens.Home

import android.health.connect.datatypes.ExerciseRoute
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun HomeScreen(
    currentRoute: String,
    onItemClick:(String)-> Unit
) {
    val items = listOf(
        BottomNavItem("Home",Icons.Default.Home),
        BottomNavItem("Updates",Icons.Default.Warning),
        BottomNavItem("Solutions",Icons.Default.CheckCircle),
        BottomNavItem("Help",Icons.Default.Info)

    )
    BottomNavigation{
        items.forEach {item ->
            BottomNavigationItem(
                icon =
                { Icon(item.icon, contentDescription = item.title )},
                label = {Text(item.title)},
                selected = currentRoute == item.route,
                onClick = {onItemClick(item.route)}
            )

        }
    }
}
data class BottomNavItem(val title:
String,val icon : ImageVector , val route: String)

@Composable
fun MainScreen() {
    var currentRoute by remember {
        mutableStateOf("home")
    }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("DREIO APP") })
        },
        bottomBar = {
            HomeScreen(currentRoute = currentRoute) { route ->
                currentRoute = route
            }
        },
        content = {padding ->
            when (currentRoute){
                "Home" ->
                    HomeScreen(Modifier.padding(padding))
                    "Updates" ->
                        UpdateScreen(Modifier.padding(padding))
                "Solutions" ->
                    SolutionScreen(Modifier.padding(padding))
                "Help" ->
                    HelpScreen(Modifier.padding(padding))
            }
        }
    )
}






