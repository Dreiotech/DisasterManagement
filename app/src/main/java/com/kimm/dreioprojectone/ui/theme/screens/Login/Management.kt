package com.kimm.dreioprojectone.ui.theme.screens.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ManagementScreen() {



var name by remember { mutableStateOf(TextFieldValue("")) }
var number by remember { mutableStateOf(TextFieldValue("")) }
var problem by remember { mutableStateOf(TextFieldValue("")) }
var context = LocalContext.current
Column (
horizontalAlignment = Alignment.CenterHorizontally,
verticalArrangement = Arrangement.Center,
modifier = Modifier
    .fillMaxSize()
    .padding(20.dp)
    .background(Color.Red)

){
    Text(text = "Please Inform us of any cases of Drought,Floods and Wildfire." +
            "We are ready to Help",
        color = Color.White,
        fontSize = 20.sp,
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light
    )

    Spacer(modifier = Modifier.height(50.dp))
    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "name"
            )
        },
        label = {
            Text(
                text = " Full Name ",
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
    Spacer(modifier = Modifier.height(30.dp))
    OutlinedTextField(
        value = number,
        onValueChange = { number = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "email"
            )
        },
        label = {
            Text(
                text = " Phone Number ",
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
    Spacer(modifier = Modifier.height(30.dp))
    OutlinedTextField(
        value = problem,
        onValueChange = { problem = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Warning,
                contentDescription = "pass"
            )
        },
        label = {
            Text(
                text = " Report Problem ",
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
    Spacer(modifier = Modifier.height(30.dp))


    Button(onClick = {

    },
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(text = "Proceed",
            fontSize = 15.sp)
    }
}
}

@Preview
@Composable
private fun Managementprev() {
    ManagementScreen()

}