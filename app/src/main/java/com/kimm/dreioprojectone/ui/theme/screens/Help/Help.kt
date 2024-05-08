package com.kimm.dreioprojectone.ui.theme.screens.Help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
}

@Preview
@Composable
private fun Helpprev() {
    HelpScreen()

}

