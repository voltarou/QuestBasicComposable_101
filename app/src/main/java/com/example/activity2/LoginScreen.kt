package com.example.activity2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale // Import ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity2.R // Make sure R is imported if it's in a different package (usually not needed for drawables in the same module)

@Composable
fun LoginScreen() {
    Box( // Use Box to layer content
        modifier = Modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.nyantai), // Your background image
            contentDescription = null, // Background images often don't need a content description
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // Scale the image to fill the bounds, cropping if necessary
        )

        // Your existing Column content on top of the background image
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Login",
                style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Bold),
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Ini adalah halaman login,",
                style = TextStyle(fontSize = 16.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo Universitas",
                modifier = Modifier.size(300.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Red
            )
            Text(
                text = "Bagus Adnan Siraid",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "20230140101",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(14.dp))
            Surface(
                shape = CircleShape,
                modifier = Modifier
                    .size(350.dp)
                    .border(4.dp, Color.White, CircleShape),
                tonalElevation = 6.dp
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto),
                    contentDescription = "Foto Profil",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape),
                    alignment = Alignment.Center
                )
            }
        }
    }
}