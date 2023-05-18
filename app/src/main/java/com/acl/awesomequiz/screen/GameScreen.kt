package com.acl.awesomequiz.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.acl.awesomequiz.custom.primaryColor
import com.acl.awesomequiz.data.Question
import com.acl.awesomequiz.data.questionList

@Composable
fun GameScreen(navController: NavHostController) {

    BackHandler {
        navController.popBackStack()
    }

    val currentQuestion: MutableState<Question> = remember {
        mutableStateOf(getRandomQuestion(questionList))
    }
    val index = remember {
        mutableStateOf(1)
    }
    val score = remember {
        mutableStateOf(0)
    }
    val interactionSource = remember {
        MutableInteractionSource()
    }

    fun checkAnswer(answerIndex: Int) {
        index.value++
        if (answerIndex == currentQuestion.value.answerIndex) {
            // Update the score
            score.value++
        }
        // Get the next question
        currentQuestion.value = getRandomQuestion(questionList)
    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title
        Text(
            text = "QUIZ GAME",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = primaryColor
        )
        Spacer(
            modifier = Modifier.height(64.dp)
        )
        // Question
        val question = "Question ${index.value}: ${currentQuestion.value.question}"
        Text(
            text = question,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        // Choices
        currentQuestion.value.options.forEachIndexed { index, option ->
            Box(
                modifier = Modifier
                    .clickable(interactionSource = interactionSource, indication = null) {
                        checkAnswer(index)
                    }
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(color = primaryColor, shape = RoundedCornerShape(100)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = option,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(
            modifier = Modifier.height(48.dp)
        )
        // Score
        Text(
            text = "Your score is ${score.value}",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = primaryColor
        )
    }
}

fun getRandomQuestion(questionList: List<Question>): Question {
    val randomIndex = (questionList.indices).random()
    return questionList[randomIndex]
}
