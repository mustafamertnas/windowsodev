package com.mmertnas.winodev.Navigation

sealed class AppScreen(val route: String){

    data object StartingScreen: AppScreen("StartingScreen")
    data object QuizScreen: AppScreen("QuizScreen")


}