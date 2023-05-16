package com.acl.awesomequiz.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.acl.awesomequiz.R
import com.acl.awesomequiz.custom.primaryColor

@Composable
fun QuoteScreen(navController: NavHostController) {
    BackHandler {
        navController.popBackStack()
    }
    Box(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "Happy Coding",
            fontWeight = FontWeight.Bold,
            fontSize = 64.sp,
            color = primaryColor
        )

    }
}




