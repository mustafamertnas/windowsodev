package com.mmertnas.winodev

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mmertnas.winodev.Navigation.AppScreen


@Composable
fun FinishScreen(navController: NavController,questionValue: Double,answerValue: Double){
var score = answerValue/questionValue

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
    Text(text="Skorunuz $score")
        Spacer(modifier = Modifier.height(20.dp))

        Text(text="Devam butonu ile 5 soru daha çöz veya bugünlük bu kadar butonuyla başa dön")

        Button(onClick = {}) {


        }


        Button(onClick ={
            navController.navigate(AppScreen.StartingScreen.route)
        },
        ) {

        }
    }

}