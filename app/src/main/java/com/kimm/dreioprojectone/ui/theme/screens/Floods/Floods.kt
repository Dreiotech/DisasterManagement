package com.kimm.dreioprojectone.ui.theme.screens.Floods

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kimm.dreioprojectone.R

@Composable
fun FloodScreen () {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(800.dp)
            .background(Color.Cyan)
    ){
        Card {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(painter = painterResource(id = R.drawable.floods),
                    contentDescription ="",
                    modifier = Modifier
                        .width(150.dp)
                        .padding(0.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "Floods is a major disaster in The Country" +
                        ""

                        , fontSize = 20.sp)

                Spacer(modifier = Modifier.width(15.dp))

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )


            }
        }

    }
}

@Preview
@Composable
private fun Floodprev() {
    FloodScreen()

}

