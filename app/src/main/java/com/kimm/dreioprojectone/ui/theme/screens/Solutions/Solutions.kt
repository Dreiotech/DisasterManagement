package com.kimm.dreioprojectone.ui.theme.screens.Solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.kimm.dreioprojectone.R

@Composable
fun SolutionScreen () {
    Surface (color = MaterialTheme.colorScheme.background){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.volunteer) ,
                contentDescription =" Solution Society" ,
                Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "The Society is recruiting members who want to be volunteers in Disaster Management." +
                        "Details will be discussed further in this page",
                color = Color.Black,
                fontSize = TextUnit.Unspecified,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

              )
        }
    }
    Spacer(modifier = Modifier.height(10.dp) )


    Surface (color = MaterialTheme.colorScheme.background){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.floodsolutions) ,
                contentDescription =" Solution Society" ,
                Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "We introduced this mechanism to establish flood barriers which has helped " +
                        "to reduce chances of floods in flood striken areas",
                color = Color.Black,
                fontSize = TextUnit.Unspecified,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

            )
        }
    }
    Spacer(modifier = Modifier.height(10.dp) )




    Surface (color = MaterialTheme.colorScheme.background){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.fireengine) ,
                contentDescription =" Solution Society" ,
                Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Our team has a bunch of fire engines which have helped in" +
                        "solving rapid wildfire cases rescuing many people from severe injuries ",
                color = Color.Black,
                fontSize = TextUnit.Unspecified,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

            )
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
    Surface (color = MaterialTheme.colorScheme.background){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dam) ,
                contentDescription =" Solution Society" ,
                Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "We have established dams in drought striken areas so" +
                        "as to increase water supply required for irrigation" +
                        "which would immersely improve crop production in those" +
                        "areas",
                color = Color.Black,
                fontSize = TextUnit.Unspecified,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

            )
        }
    }
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
                text = " Send Message regarding our community ",
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
private fun Solutionprev() {
    SolutionScreen()

}



