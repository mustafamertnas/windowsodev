package com.mmertnas.winodev

import android.R.attr.onClick
import android.graphics.Paint
import android.icu.text.TimeZoneFormat.Style
import android.util.Log.e
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.mmertnas.winodev.Navigation.AppScreen
import kotlin.random.Random

@Composable
fun StartingScreen(navController: NavHostController){

    Column(modifier = Modifier,
        verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Pekiştirmeli Öğrenme Oyununa Başlamaya Hazır Mısın",
            modifier = Modifier.padding(horizontal = 70.dp, vertical = 200.dp))

        Spacer(modifier = Modifier.height(200.dp))

        ElevatedButton(
            onClick ={
            navController.navigate(AppScreen.QuizScreen.createRoute(0.0,0.0))
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03A9F4))
        ) {
            Text("Başla")
        }

    }


}