package com.acl.awesomequiz.screen

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acl.awesomequiz.custom.primaryColor

@Composable
fun MenuScreen(navController: NavController) {
    val context = LocalContext.current

    val interactionSource = remember {
        MutableInteractionSource()
    }

    fun exit(){
        (context as? Activity)?.finish()
    }

    BackHandler {
        exit()
    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game")
                }
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .background(color = primaryColor, shape = RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "PLAY GAME",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

        Box(
            modifier = Modifier
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("options")
                }
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .background(color = primaryColor, shape = RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "OPTIONS",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

        Box(
            modifier = Modifier
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("about")
                }
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .background(color = primaryColor, shape = RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "ABOUT",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

        Box(
            modifier = Modifier
                .clickable(interactionSource = interactionSource, indication = null) {
                    exit()
                }
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .background(color = primaryColor, shape = RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "EXIT",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}