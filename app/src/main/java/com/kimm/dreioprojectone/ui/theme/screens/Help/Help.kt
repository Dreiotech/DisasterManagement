package com.kimm.dreioprojectone.ui.theme.screens.Help

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelpScreen () {
    Scaffold (
        topBar = {
            TopAppBar(title = { Text("Disaster Management") })
        },
        content = {padding ->

            Column (Modifier.padding(padding)){
                Text("Safety Tips",
                    style = MaterialTheme.typography.headlineLarge)
                Text(
                    "1. Prepare an Emergency Kit "+

                    "2.Follow Evacuation Orders"+

                    "3.Have a Communication Plan.Once you login to this app you will see our contacts"+

                    "4.Be Informed with Official Alerts",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    )
    Text(text = "Phone number : 0703776762" +
            "Email Address : Solution@gmail.com")
    var message by remember { mutableStateOf("") }
    OutlinedTextField(
        value = message,
        onValueChange = { message = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "message"
            )
        },
        label = {
            Text(
                text = " Search  ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions()
    )
}

@Preview
@Composable
private fun Helpprev() {
    HelpScreen()

}

