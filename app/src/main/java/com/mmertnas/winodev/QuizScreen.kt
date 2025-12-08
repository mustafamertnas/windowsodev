package com.mmertnas.winodev

import GrammarOptionButton
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.NavHostController
import com.mmertnas.winodev.Data.questions

import kotlin.random.Random

@Composable
fun QuizScreen(
    navController: NavHostController

){

    val questions = questions
    // --- STATE YÖNETİMİ ---
    var currentIndex by remember { mutableIntStateOf(0) }
    var score by remember { mutableIntStateOf(0) }
    var QuestionsValue by remember { mutableStateOf(0) }
    var finishGame by remember { mutableStateOf(false) }

    // Seçim yapıldı mı kontrolü (Butonları kilitlemek ve renk değiştirmek için)
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var isAnswerChecked by remember { mutableStateOf(false) }

    val currentQuestion = questions[currentIndex]

    fun handleAnswerClick(option: Boolean) {
        if (isAnswerChecked) return

        isAnswerChecked = true
        QuestionsValue +=10
        if (option) {
            score += 10

        }
    }

    fun nextQuestion() {
       currentIndex= Random.nextInt(30)
            selectedOption = null
            isAnswerChecked = false

    }

    if(finishGame){
    FinishScreen(navController,QuestionsValue,score)
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
                progress = { (currentIndex + 1) / questions.size.toFloat() },
                modifier = Modifier.fillMaxWidth().height(8.dp),
                color = Color(0xFF6200EE),
                trackColor = Color.LightGray,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Question ${currentIndex + 1} / ${questions.size}",
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
                        text = currentQuestion.sentence.replace("___", "_______"),
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF333333)
                    )
                }
            }




            //ŞIKLAR
            currentQuestion.options.forEach { option ->
                GrammarOptionButton(
                    text = option,
                    isSelected = selectedOption == option,
                    isCorrect = option == currentQuestion.correctAnswer,
                    isRevealMode = isAnswerChecked, // Cevap kontrol modu açık mı?
                    onClick = { handleAnswerClick(option == currentQuestion.correctAnswer) }
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
                            color = if (selectedOption == currentQuestion.correctAnswer) Color(0xFF2E7D32) else Color(0xFFC62828)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = currentQuestion.explanation, style = MaterialTheme.typography.bodyMedium)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { nextQuestion() },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE))
                ) {
                    Text("Sonraki Soru")
                }


            }

            Button({finishGame=true}) {
                Text("bitir")
            }
        }
    }

    }

