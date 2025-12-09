package com.mmertnas.winodev.Navigation

sealed class AppScreen(val route: String){

    data object StartingScreen: AppScreen("StartingScreen")
    data object QuizScreen: AppScreen("QuizScreen/{scoreValue}/{questionValue}"){
        fun createRoute(score: Double,question: Double): String{
            return "QuizScreen/$score/$question" }
    }


}