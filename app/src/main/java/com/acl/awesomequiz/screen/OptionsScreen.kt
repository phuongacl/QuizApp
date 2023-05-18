package com.acl.awesomequiz.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acl.awesomequiz.custom.primaryColor

@Composable
fun OptionsScreen(navController: NavController) {

    var isSoundsEnabled by remember { mutableStateOf(false) }
    var isDarkModeEnabled by remember { mutableStateOf(false) }

    BackHandler {
        navController.popBackStack()
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column {
            Text(
                text = "Options",
                color = primaryColor,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
            )

            Column(
                modifier = Modifier.padding(32.dp)
            ) {
                // Display mode option
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Dark mode", style = MaterialTheme.typography.body1)

                    Spacer(Modifier.width(16.dp))

                    Switch(
                        checked = isDarkModeEnabled,
                        onCheckedChange = { isDarkModeEnabled = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = MaterialTheme.colors.secondary,
                            uncheckedThumbColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled)
                        )
                    )
                }
                Spacer(Modifier.height(16.dp))
                // Sounds option
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Sounds", style = MaterialTheme.typography.body1)

                    Spacer(Modifier.width(16.dp))

                    Switch(
                        checked = isSoundsEnabled,
                        onCheckedChange = { isSoundsEnabled = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = MaterialTheme.colors.secondary,
                            uncheckedThumbColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled)
                        )
                    )
                }
            }
        }
    }
}