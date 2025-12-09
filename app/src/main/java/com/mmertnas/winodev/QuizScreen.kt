package com.mmertnas.winodev

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mmertnas.winodev.Data.questions

import kotlin.random.Random

@Composable
fun QuizScreen(
    navController: NavHostController,
    scoreValue: Double,
    questionValue: Double

){




    val questions = questions


    var currentIndex by remember { mutableIntStateOf(Random.nextInt(questions.size)) }
    var score: Double by remember { mutableStateOf(0.0) }
    var questionsValue: Double by remember { mutableStateOf(0.0) }
    var finishGame by remember { mutableStateOf(false) }


    LaunchedEffect(scoreValue,questionValue) {
        score = scoreValue
        questionsValue = questionValue
    }



    // Seçim yapıldı mı kontrolü (Butonları kilitlemek ve renk değiştirmek için)
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var isAnswerChecked by remember { mutableStateOf(false) }
    var i : Int by remember { mutableStateOf(0) }
    val currentQuestion = questions[currentIndex]

    fun CheckAnswer(option: String){
        selectedOption=option
        if(isAnswerChecked){
            return
        }
        else{
            questionsValue+=10
            if (option==currentQuestion.correctAnswer){

                score +=10
            }
            isAnswerChecked=true

        }


    }


    fun nextQuestion() {
       currentIndex= Random.nextInt(questions.size)
            selectedOption = null
            isAnswerChecked = false
        i++
            if(i>5){
              finishGame=true
            }

    }




    if(finishGame){
    FinishScreen(navController,questionsValue,score)
    }else{
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFEFEFEF))
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(45.dp))

            LinearProgressIndicator(
                progress = { (i) / 5.toFloat() },
                modifier = Modifier.fillMaxWidth().height(8.dp),
                color = Color(0xFF03A9F4),
                trackColor = Color.LightGray,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Question ${i} / ${5}",
                style = MaterialTheme.typography.labelLarge
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Soru Kartı
            Card(
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text(
                        text = currentQuestion.sentence,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF333333)
                    )
                }
            }




            //ŞIKLAR
            currentQuestion.options.forEach { option ->
                OptionsButton(
                    text = option,
                    isSelected = selectedOption == option,
                    isCorrect = option == currentQuestion.correctAnswer,
                    isRevealMode = isAnswerChecked,
                    onClick = {

                        CheckAnswer(option)

                    }
                )
                Spacer(modifier = Modifier.height(25.dp))
            }


            // Açıklama ve İleri Butonu (Sadece cevap verildiyse görünür)
            if (isAnswerChecked) {
                Spacer(modifier = Modifier.height(24.dp))

                // Açıklama Kutusu
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = if (selectedOption == currentQuestion.correctAnswer) Color(0xFFE8F5E9) else Color(0xFFFFEBEE)
                    ),

                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = if (selectedOption == currentQuestion.correctAnswer) "Doğru! 🎉" else "Yanlış 😔",
                            fontWeight = FontWeight.Bold,
                            color = if (selectedOption == currentQuestion.correctAnswer) Color(
                                0xFF03A9F4
                            ) else Color(0xFFA4051D)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = currentQuestion.explanation, style = MaterialTheme.typography.bodyMedium)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { nextQuestion() },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA4051D))
                ) {
                    Text("Sonraki Soru")
                }


            }

            Button({finishGame=true},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03A9F4))) {
                Text("bitir")
            }
        }
    }

    }

@Composable
fun OptionsButton(
    text: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    isRevealMode: Boolean,
    onClick: () -> Unit
) {

    val backgroundColor by animateColorAsState(
        targetValue = when {
            isRevealMode && isCorrect -> Color(0xFF4CAF50) // Doğru cevap her zaman yeşil yanar (göstermek için)
            isRevealMode && isSelected && !isCorrect -> Color(0xFFEF5350) // Seçili ama yanlışsa kırmızı
            isRevealMode && !isCorrect -> Color.LightGray.copy(alpha = 0.5f) // Seçilmeyen diğer yanlış şıklar silikleşir
            else -> Color.White // Henüz seçilmediyse beyaz
        },
        label = "ButtonColor"
    )

    val contentColor = if (isRevealMode && (isCorrect || isSelected)) Color.White else Color.Black

    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth().height(55.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        border = if (!isRevealMode) ButtonDefaults.outlinedButtonBorder.copy(brush = androidx.compose.ui.graphics.SolidColor(Color.Gray)) else null,
        enabled = !isRevealMode
    ) {
        Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Medium)
    }
}



