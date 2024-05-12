package com.kimm.dreioprojectone.ui.theme.screens.Solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.sp
import com.kimm.dreioprojectone.R


data class SolutionModel(val name:String, val image :Int)
@Composable
fun SolutionRow(model: SolutionModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Black)
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
            fontSize = 23.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }
}
private val SolutionList = mutableListOf<SolutionModel>().apply {
    add(SolutionModel("We have recruited volunteer members for our organization",R.drawable.volunteer))
    add(SolutionModel("We have equipped fire engine so as to help in rapid wildfire cases", R.drawable.fireengine))
    add(SolutionModel("We have developed this technique so as to help " +
            " in drought cases to increase food production", R.drawable.dam))
    add(SolutionModel("We have developed this technique so as to help " +
       " reduce flood risk in affected areas" , R.drawable.floodsolutions))
    add(SolutionModel("We have worked together with the NGO's in order to help " +
            " solve disaster in this nation", R.drawable.ngos))
    add(SolutionModel("Since our organization is worldwide we have managed to teach most" +
            " schools in the world about the importance of disaster management", R.drawable.schools))
    add(SolutionModel("Through an interview in BBC News, we managed to explain to the media how " +
            "disaster has caused destructions in the world." +
            "we explained the importance of our app" +
            "during this situations" ,R.drawable.disaster)
    )
}


@Composable
fun SolutionColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(SolutionList) { model ->
            SolutionRow(model = model)
        }
    }

}

@Preview
@Composable
private fun SolutionColumnprev() {
    SolutionColumn()
}


