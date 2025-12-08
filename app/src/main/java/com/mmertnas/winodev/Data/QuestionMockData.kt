package com.mmertnas.winodev.Data



val questions =
    listOf(
        // ********************* TENSES (ZAMANLAR) *********************
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
            sentence = "By the time we arrived, the movie ___ already ___.",
            options = listOf("had / started", "has / started", "was / starting", "did / start"),
            correctAnswer = "had / started",
            explanation = "Geçmişte yaşanan iki olaydan daha önce olanı anlatmak için Past Perfect (had V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "What ___ you ___ when I called you last night?",
            options = listOf("did / do", "were / doing", "are / doing", "have / done"),
            correctAnswer = "were / doing",
            explanation = "Geçmişte belirli bir anda devam eden eylemi anlatmak için Past Continuous (was/were V-ing) kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ to Paris next week.",
            options = listOf("go", "are going", "went", "have gone"),
            correctAnswer = "are going",
            explanation = "Gelecekteki kesinleşmiş düzenlemeler için Present Continuous (V-ing) yaygın olarak kullanılır."
        ),
        EnglishQuestions(
            sentence = "The earth ___ around the sun.",
            options = listOf("is revolving", "revolves", "revolved", "has revolved"),
            correctAnswer = "revolves",
            explanation = "Evrensel gerçekler ve bilimsel olaylar için Simple Present kullanılır."
        ),
        EnglishQuestions(
            sentence = "I ___ finished my homework, so I can go out now.",
            options = listOf("just", "already", "yet", "ever"),
            correctAnswer = "just",
            explanation = "Yakın zamanda tamamlanmış eylemler için Present Perfect ile 'just' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He ___ for the company for ten years when he retires next month.",
            options = listOf("will work", "will be working", "will have worked", "has worked"),
            correctAnswer = "will have worked",
            explanation = "Gelecekteki belirli bir zamana kadar sürecek olan eylemi vurgulamak için Future Perfect (will have V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "We ___ three books this month.",
            options = listOf("read", "are reading", "have read", "had read"),
            correctAnswer = "have read",
            explanation = "Şu ana kadar (bu ay içinde) tamamlanmış bir eylemi anlatmak için Present Perfect kullanılır."
        ),
        EnglishQuestions(
            sentence = "The train ___ at 8 a.m. tomorrow.",
            options = listOf("is leaving", "leaves", "will leave", "is going to leave"),
            correctAnswer = "leaves",
            explanation = "Sabit zaman çizelgeleri ve programlanmış olaylar için Present Simple kullanılır."
        ),

        // ********************* CONDITIONALS (ŞART CÜMLELERİ) & MODALS (KİPLER) *********************
        EnglishQuestions(
            sentence = "If I ___ you, I would accept the offer.",
            options = listOf("was", "am", "were", "be"),
            correctAnswer = "were",
            explanation = "Type 2 Conditional (Hayali durumlar) cümlelerinde 'I' için bile 'were' kullanılır (Subjunctive Mood)."
        ),
        EnglishQuestions(
            sentence = "If it ___, we will go to the beach.",
            options = listOf("doesn't rain", "didn't rain", "won't rain", "isn't raining"),
            correctAnswer = "doesn't rain",
            explanation = "Type 1 Conditional (Gerçekleşmesi olası durumlar) cümlelerinde 'if' kısmında Simple Present kullanılır."
        ),
        EnglishQuestions(
            sentence = "If you had studied harder, you ___ passed the exam.",
            options = listOf("would", "would have", "will have", "can"),
            correctAnswer = "would have",
            explanation = "Type 3 Conditional (Geçmişteki gerçekleşmeyen durumlar) ana cümlesinde 'would have V3' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ smoke in the hospital.",
            options = listOf("mustn't", "don't have to", "shouldn't", "can't"),
            correctAnswer = "mustn't",
            explanation = "Kesin yasaklama veya mecburiyetin olumsuz hali için 'mustn't' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ I borrow your pen for a moment?",
            options = listOf("Must", "Should", "May", "Ought to"),
            correctAnswer = "May",
            explanation = "İzin istemek için kibar bir ifade olan 'May' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She ___ be tired after working all day.",
            options = listOf("must", "should", "could", "would"),
            correctAnswer = "must",
            explanation = "Güçlü bir çıkarım veya mantıksal zorunluluk için 'must' kullanılır."
        ),

        // ********************* PREPOSITIONS (EDATLAR) & ADVERBS (ZARFLAR) *********************
        EnglishQuestions(
            sentence = "The book is ___ the table.",
            options = listOf("in", "on", "at", "through"),
            correctAnswer = "on",
            explanation = "Yüzeyin üzerinde duran nesneler için 'on' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I was born ___ July 15th.",
            options = listOf("in", "on", "at", "by"),
            correctAnswer = "on",
            explanation = "Belirli günler veya tarihler için 'on' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is good ___ solving problems.",
            options = listOf("at", "on", "in", "to"),
            correctAnswer = "at",
            explanation = "'Good at' (bir konuda iyi olmak) kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "We met ___ the corner of the street.",
            options = listOf("in", "on", "at", "over"),
            correctAnswer = "at",
            explanation = "Spesifik bir nokta veya köşe için 'at' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He speaks English very ___.",
            options = listOf("good", "well", "better", "best"),
            correctAnswer = "well",
            explanation = "Fiili (speaks) niteleyen bir zarf (adverb) olan 'well' kullanılır."
        ),

        // ********************* PASSIVE VOICE (EDİLGEN ÇATI) & CAUSATIVE (ETTİRGEN) *********************
        EnglishQuestions(
            sentence = "The new bridge ___ last year.",
            options = listOf("built", "was built", "is built", "has built"),
            correctAnswer = "was built",
            explanation = "Geçmişte yapılan ve öznenin eylemi gerçekleştiremediği durumlar için Past Simple Passive (was/were V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "My car ___ repaired yesterday.",
            options = listOf("have / had", "had / had", "got / repair", "was / repairing"),
            correctAnswer = "had / had",
            explanation = "Ettirgen çatıda (Causative) birine bir şeyi yaptırmak anlamında 'have V3' (get V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "This project ___ by the end of the month.",
            options = listOf("will finish", "will be finished", "has been finished", "is finishing"),
            correctAnswer = "will be finished",
            explanation = "Gelecekte tamamlanacak edilgen eylem için Future Simple Passive (will be V3) kullanılır."
        ),

        // ********************* REPORTED SPEECH (DOLAYLI ANLATIM) & ARTICLES (TANIMLAYICILAR) *********************
        EnglishQuestions(
            sentence = "He said he ___ coming to the party.",
            options = listOf("is", "was", "will be", "has been"),
            correctAnswer = "was",
            explanation = "Dolaylı anlatımda (Reported Speech), ana zaman (said) geçmiş zaman olduğu için 'is' zaman kaymasıyla 'was' olur."
        ),
        EnglishQuestions(
            sentence = "She asked me ___ I had seen her keys.",
            options = listOf("that", "if", "what", "where"),
            correctAnswer = "if",
            explanation = "Yes/No sorularının dolaylı anlatımında 'if' veya 'whether' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Can you pass me ___ sugar, please?",
            options = listOf("a", "an", "the", "- (none)"),
            correctAnswer = "- (none)",
            explanation = "Genel ve sayılamayan isimler için belirsiz bir miktar istendiğinde 'a/an/the' kullanılmaz."
        ),
        EnglishQuestions(
            sentence = "___ sun rises in the east.",
            options = listOf("A", "An", "The", "- (none)"),
            correctAnswer = "The",
            explanation = "Eşsiz (tek) nesneler için kesin tanımlayıcı (definite article) 'the' kullanılır."
        ),

        // ********************* GERUNDS & INFINITIVES (FİİLİMSİLER) *********************
        EnglishQuestions(
            sentence = "I enjoy ___ movies.",
            options = listOf("watch", "to watch", "watching", "watched"),
            correctAnswer = "watching",
            explanation = "'Enjoy' fiilinden sonra mastar olarak V-ing (Gerund) kullanılır."
        ),
        EnglishQuestions(
            sentence = "She decided ___ a new job.",
            options = listOf("look", "to look for", "looking for", "to looking"),
            correctAnswer = "to look for",
            explanation = "'Decide' fiilinden sonra mastar olarak 'to V1' (Infinitive) kullanılır."
        )
    )