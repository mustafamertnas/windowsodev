package com.mmertnas.winodev

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mmertnas.winodev.Navigation.AppScreen
import kotlin.math.round


@Composable
fun FinishScreen(navController: NavController, questionValue: Double, answerValue: Double){
var score = round((answerValue/ questionValue) *100)/100

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
    Text(text="Skorunuz $score")
        Spacer(modifier = Modifier.height(20.dp))

        Text(text="Devam butonu ile 5 soru daha çözerek öğrendiklerini pekiştir veya bugünlük bu kadar butonuyla başa dön")

        Button(onClick = {navController.navigate(AppScreen.QuizScreen.createRoute(answerValue,questionValue))},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03A9F4))) {
                Text("Öğrenmeye Devam Et")

        }


        Button(onClick ={
            navController.navigate(AppScreen.StartingScreen.route)
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA4051D))
        ) {
            Text("Bugünlük Bu Kadar")
        }
    }

}