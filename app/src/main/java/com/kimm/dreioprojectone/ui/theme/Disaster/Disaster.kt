package com.kimm.dreioprojectone.ui.theme.Disaster

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
fun DisasterScreen() {
    Text(text = "Our Community helps people who undergo this disasters shown in this page")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black)
    ) {
        Card {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.floods),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .padding(0.dp)

                )
                Spacer(modifier = Modifier.width(15.dp))

                Text(text = "FLOODS IS A MAJOR DISASTER SINCE APRIL", fontSize = 20.sp)

                Spacer(modifier = Modifier.width(106.dp))

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )
            }
        }
    }
    Spacer(modifier = Modifier.width(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Black)
        ) {
            Card {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fire),
                        contentDescription = "",
                        modifier = Modifier
                            .width(100.dp)
                            .padding(0.dp)

                    )
                    Spacer(modifier = Modifier.width(15.dp))

                    Text(text = "WILDFIRE", fontSize = 20.sp)

                    Spacer(modifier = Modifier.width(106.dp))

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = ""
                    )

                }
            }

        }

    Spacer(modifier = Modifier.width(15.dp))


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black)
    ) {
        Card {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.drought),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .padding(0.dp)

                )
                Spacer(modifier = Modifier.width(15.dp))

                Text(text = "DROUGHT", fontSize = 20.sp)

                Spacer(modifier = Modifier.width(106.dp))

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
private fun Disasterprev() {
    DisasterScreen()

}

