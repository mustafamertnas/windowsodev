package com.mmertnas.winodev.Data



val questions  =
    listOf(
        EnglishQuestions(
            sentence = "I have been living here ___ 2010.",
            options = listOf("for", "since", "ago", "in"),
            correctAnswer = "since",
            explanation = "Net bir başlangıç tarihi (2010) verildiğinde 'since' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She ___ usually ___ coffee in the mornings.",
            options = listOf(
                "don't / drink",
                "doesn't / drinks",
                "doesn't / drink",
                "isn't / drinking"
            ),
            correctAnswer = "doesn't / drink",
            explanation = "Geniş zaman (Simple Present) ve 'She' öznesi için 'doesn't' kullanılır, fiil yalın kalır."
        ),
        EnglishQuestions(
            sentence = "If I ___ you, I would accept the offer.",
            options = listOf("was", "am", "were", "be"),
            correctAnswer = "were",
            explanation = "Type 2 Conditional (Hayali durumlar) cümlelerinde 'I' için bile 'were' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The book is ___ the table.",
            options = listOf("in", "on", "at", "through"),
            correctAnswer = "on",
            explanation = "Yüzeyin üzerinde duran nesneler için 'on' kullanılır."
        ),
        EnglishQuestions(
            sentence = "By the time we arrived, the movie ___ already ___.",
            options = listOf("had / started", "has / started", "was / starting", "did / start"),
            correctAnswer = "had / started",
            explanation = "Geçmişte yaşanan iki olaydan daha önce olanı anlatmak için Past Perfect (had V3) kullanılır."
        )
    )
