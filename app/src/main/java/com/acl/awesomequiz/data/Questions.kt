package com.acl.awesomequiz.data

data class Question(
    val question: String,
    val options: List<String>,
    val answerIndex: Int
)

val questionList = listOf(
    Question(
        "What is the capital of France?",
        listOf("London", "Paris", "New York", "Sydney"),
        1
    ),
    Question(
        "What is the highest mountain in the world?",
        listOf("Everest", "Kilimanjaro", "McKinley", "Elbrus"),
        0
    ),
    Question(
        "What is the largest country in the world by area?",
        listOf("United States", "Canada", "Russia", "China"),
        2
    ),
    Question(
        "What is the smallest country in the world by land area?",
        listOf("Monaco", "Vatican", "San Marino", "Liechtenstein"),
        1
    ),
    Question(
        "What is the largest ocean in the world?",
        listOf("Atlantic", "Indian", "Southern", "Pacific"),
        0
    ),
    // Add more questions here
)
