package com.kimm.dreioprojectone.ui.theme.screens.Login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserScreen() {


// State variables to store user input
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

// Flag to indicate login success (optional for UI changes)
    var loginSuccess by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Admin Login",
            style = MaterialTheme.typography.headlineSmall,
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation() // Hide password characters
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // Implement login logic here (e.g., check credentials against a database)
                // For simplicity, this example uses dummy credentials
                val validUsername = "admin"
                val validPassword = "secret"
                loginSuccess = (username == validUsername && password == validPassword)
            }
        ) {
            Text("Login")
        }

        if (loginSuccess) {
            Text(text = "Login Successful!", color = Color.Green)
        } else {
            // Optional: Show error message if login fails
        }
    }
}

@Preview
@Composable
private fun Userprev() {
    UserScreen()

}
