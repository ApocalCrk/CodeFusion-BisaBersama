
package com.example.bisabersama.screens
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Bisa Bersama", style = MaterialTheme.typography.titleLarge, color = Color.Black, fontWeight = FontWeight.Bold)
        Spacer(modifier = modifier.height(16.dp))

        Text(text = "Halo! Silakan masuk untuk mengakses akun Anda.", style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = modifier.height(32.dp))

        Column {
            Text(text = "Email", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.primary)
            Spacer(modifier = modifier.height(4.dp))
            TextField(
                value = email.value,
                onValueChange = { email.value = it },
                placeholder = { Text("Masukkan Email") },
                singleLine = true,
                shape = RoundedCornerShape(12.dp)
            )
        }

        Spacer(modifier = modifier.height(32.dp))

        Column {
            Text(text = "Kata Sandi", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.primary)
            Spacer(modifier = modifier.height(4.dp))
            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                placeholder = { Text("Masukkan Kata Sandi") },
                singleLine = true,
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0077B6)),
            shape = RoundedCornerShape(20),
            modifier = Modifier.size(width = 280.dp, height = 50.dp)
        ) {
            Text(text = "Masuk")
        }

        Spacer(modifier = Modifier.height(16.dp))

        ClickableText(
            text = AnnotatedString("Belum punya akun ? Daftar disini"),
            style = MaterialTheme.typography.bodySmall,
            onClick = {
                navController.navigate("registerScreen")
            }
        )

    }
}
