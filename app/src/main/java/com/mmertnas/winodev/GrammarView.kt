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
import com.mmertnas.winodev.Data.EnglishQuestions
import com.mmertnas.winodev.Data.questions

@Composable
fun GrammarView() {
    //Mock Soru Seti
    val questions = questions
    // --- STATE YÖNETİMİ ---
    var currentIndex by remember { mutableIntStateOf(0) }
    var score by remember { mutableIntStateOf(0) }
    var isGameOver by remember { mutableStateOf(false) }

    // Seçim yapıldı mı kontrolü (Butonları kilitlemek ve renk değiştirmek için)
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var isAnswerChecked by remember { mutableStateOf(false) }

    // Mevcut soru
    val currentQuestion = questions[currentIndex]

    // --- FONKSİYONLAR ---
    fun handleAnswerClick(option: String) {
        if (isAnswerChecked) return // Zaten cevaplandıysa işlem yapma

        selectedOption = option
        isAnswerChecked = true

        if (option == currentQuestion.correctAnswer) {
            score += 10
        }
    }

    fun nextQuestion() {
        if (currentIndex < questions.size - 1) {
            currentIndex++
            selectedOption = null
            isAnswerChecked = false
        } else {
            isGameOver = true
        }
    }

    // --- UI TASARIMI ---
    if (isGameOver) {
        GrammarResultScreen(score = score, totalQuestions = questions.size) {
            currentIndex = 0
            score = 0
            isGameOver = false
            selectedOption = null
            isAnswerChecked = false
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFEFEFEF))
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

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
                        text = currentQuestion.sentence.replace("___", "_____"),
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
                        onClick = { handleAnswerClick(option) }
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
        }
    }
}

@Composable
fun GrammarOptionButton(
    text: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    isRevealMode: Boolean,
    onClick: () -> Unit
) {
    // Renk animasyonu ve mantığı
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
    val borderColor = if (isSelected && !isRevealMode) Color(0xFF6200EE) else Color.Transparent

    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth().height(55.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        border = if (!isRevealMode) ButtonDefaults.outlinedButtonBorder.copy(brush = androidx.compose.ui.graphics.SolidColor(Color.Gray)) else null,
        enabled = !isRevealMode // Cevap verildikten sonra tıklanamaz
    ) {
        Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun GrammarResultScreen(score: Int, totalQuestions: Int, onRestart: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Test Tamamlandı!", style = MaterialTheme.typography.displaySmall)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Skor: $score / ${totalQuestions * 10}",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onRestart) {
            Text("Tekrar Başla")
        }
    }
}