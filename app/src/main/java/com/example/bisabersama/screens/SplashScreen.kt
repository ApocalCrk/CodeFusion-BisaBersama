package com.example.bisabersama.screens
import com.example.bisabersama.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp),
        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Bangun Tim,",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Bangun Masa Depan",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Bangun tim yang tepat, wujudkan ide-ide besar, dan kembangkan keterampilan untuk masa depan yang lebih cerah bersama.",
            style = MaterialTheme.typography.bodySmall
        )
        showImage()
        Button(
            onClick = { navController.navigate("loginScreen") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0077B6)),
            shape = RoundedCornerShape(20),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Bergabung Sekarang")
        }
    }
}

@Composable
fun showImage() {
    Image(
        painter = painterResource(id = R.drawable.image_boarding),
        contentDescription = "test",
        modifier = Modifier
            .size(400.dp),
        contentScale = ContentScale.Fit
    )
}