package com.kimm.dreioprojectone.ui.theme.Disaster

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.kimm.dreioprojectone.R


data class DisasterModel(val name:String, val image : Int)
@Composable
    fun DisasterRow(model: DisasterModel) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .background(Color.Gray)
        ) {
            Image(
                painter = painterResource(id = model.image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .padding(5.dp)
            )
            Text(
                text = model.name,
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
    private val DisasterList = mutableListOf<DisasterModel>().apply {
        add(DisasterModel("Floods",R.drawable.floods))
        add(DisasterModel("Fire", R.drawable.fire))
        add(DisasterModel("Drought", R.drawable.drought))
    }


    @Composable
    fun DisasterColumn() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            items(DisasterList) { model ->
                DisasterRow(model = model)
            }
        }
    }

    @Preview
    @Composable
    private fun DisasterColumnprev() {
        DisasterColumn()
    }


