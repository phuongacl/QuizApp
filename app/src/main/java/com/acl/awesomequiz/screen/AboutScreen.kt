package com.acl.awesomequiz.screen

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.acl.awesomequiz.R
import com.acl.awesomequiz.custom.primaryColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AboutScreen(navController: NavHostController) {
    BackHandler {
        navController.popBackStack()
    }
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Quiz Game",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            color = primaryColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "© 2023 American Code Lab",
            fontSize = 24.sp,
            color = primaryColor
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Version 1.0",
            fontSize = 20.sp,
            color = primaryColor
        )
    }
}
