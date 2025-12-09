package com.mmertnas.winodev



import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mmertnas.winodev.Navigation.AppScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
               AppNavigation()
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreen.StartingScreen.route
    ) {
        composable(AppScreen.StartingScreen.route) {
            StartingScreen(navController)
        }
        composable(AppScreen.QuizScreen.route,
            arguments = listOf(
                navArgument("scoreValue"){type= NavType.FloatType},
                navArgument("questionValue"){type= NavType.FloatType})

        ) {
            backStackEntry->
            val scoreValue: Double=backStackEntry.arguments?.getFloat("scoreValue")?.toDouble()?:0.0
            val questionValue: Double=backStackEntry.arguments?.getFloat("questionValue")?.toDouble()?:0.0

            QuizScreen(navController, scoreValue = scoreValue,questionValue)
        }
    }


}

