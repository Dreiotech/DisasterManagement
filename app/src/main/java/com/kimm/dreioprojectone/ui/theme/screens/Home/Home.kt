package com.kimm.dreioprojectone.ui.theme.screens.Home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle


import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info

import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.CheckCircle

import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Star

import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kimm.dreioprojectone.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (navController: NavController) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.White)
    ){
        Card {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(painter = painterResource(id = R.drawable.fire),
                    contentDescription ="",
                    modifier = Modifier
                        .width(100.dp)
                        .padding(0.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "WildFire Management", fontSize = 20.sp)

                Spacer(modifier = Modifier.width(15.dp))

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )


            }
        }

    }
    data class NavItemState(
        val title: String,
        val selectedIcon: ImageVector,
        val unselectedIcon: ImageVector,
        val hasBadge: Boolean,
        val messages: Int,

    )
    val items = listOf(
        NavItemState(
            title = "",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home,
            hasBadge = false,
            messages = 0,

        ),
        NavItemState(
            title = "",
            selectedIcon = Icons.Filled.CheckCircle,
            unselectedIcon = Icons.Outlined.CheckCircle,
            hasBadge = false,
            messages = 0,

        ),
        NavItemState(
            title = "",
            selectedIcon = Icons.Filled.Info,
            unselectedIcon = Icons.Outlined.Info,
            hasBadge = false,
            messages = 0,

        ),
        NavItemState(
            title = "",
        selectedIcon = Icons.Filled.Warning,
        unselectedIcon = Icons.Outlined.Warning,
        hasBadge = false,
        messages = 0,

    )
    )
    var bottomNavState by rememberSaveable {
        mutableStateOf(0)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Text(text = "DREIO", fontWeight = FontWeight.Bold)
                    }

                },
                Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20.dp)),
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate("Disaster")
                    }) {
                        Icon(imageVector = Icons.Default.Warning, contentDescription = "Disaster" )
                    }

                },
                actions = {
                    IconButton(onClick = {  }) {
                        BadgedBox(badge = { Badge(
                            Modifier.size(10.dp)
                        ) {
                        }}) {
                            Icon(imageVector = Icons.Outlined.MoreVert, contentDescription = "Updates" )
                        }

                    }
                    IconButton(onClick = {
                        navController.navigate("Help")
                    }) {
                        Icon(imageVector = Icons.Outlined.Info, contentDescription = "Help" )
                    }
                    IconButton(onClick = {
                        navController.navigate("Updates")
                    }) {
                        Icon(imageVector = Icons.Outlined.Star, contentDescription = "Updates" )
                    }
                    IconButton(onClick = {
                        navController.navigate("Management")
                    }) {
                        Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "Management" )
                    }
                    IconButton(onClick = {
                        navController.navigate("Solution")
                    }) {
                        Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = "Solution" )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Green
                )
            )
        },
        bottomBar = {
            NavigationBar(
                Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20.dp)),
                containerColor = Color.Red
            ) {
                items.forEachIndexed { index, item ->


                    NavigationBarItem(

                        selected = bottomNavState == index,
                        onClick = { bottomNavState = index },
                        icon = {
                            BadgedBox(badge = {
                                if (item.hasBadge) Badge {}
                                if (item.messages != 0) Badge {
                                    Text(text = "${item.messages}")
                                }
                            }) {
                                Icon(
                                    imageVector = if (bottomNavState == index) item.selectedIcon
                                    else item.unselectedIcon,
                                    contentDescription = item.title
                                )
                            }

                        },
                        label = { Text(text = item.title) },
                        colors = NavigationBarItemDefaults.colors(

                            selectedTextColor = Color.Cyan,

                        )
                    )
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                containerColor = Color.LightGray,
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp)
            ) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "add")
            }
        }
    ) { contentPadding ->

        Column(
            Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = items[bottomNavState].title, fontSize = 44.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun HomePrev() {
    HomeScreen(navController = rememberNavController())
}


