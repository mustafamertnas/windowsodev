package com.mmertnas.winodev.Data

data class EnglishQuestions(
    val sentence: String,      // Örn: "She ___ to school yesterday."
    val options: List<String>, // Örn: ["go", "went", "gone"]
    val correctAnswer: String, // Örn: "went"
    val explanation: String    // Örn: "Yesterday dediği için Past Tense (V2) kullanılır."
)