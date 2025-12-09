package com.mmertnas.winodev.Data



val questions =
    listOf(
        EnglishQuestions(
            sentence = "I have been living here ___ 2010.",
            options = listOf("for", "since", "ago", "in"),
            correctAnswer = "since",
            explanation = "Net bir başlangıç tarihi (2010) verildiğinde 'since' kullanılır. 'For', süre belirtir."
        ),
        EnglishQuestions(
            sentence = "She ___ to London yesterday.",
            options = listOf("goes", "gone", "went", "is going"),
            correctAnswer = "went",
            explanation = "Geçmişte bitmiş bir eylem (yesterday) Simple Past Tense gerektirir."
        ),
        EnglishQuestions(
            sentence = "We ___ dinner when the phone rang.",
            options = listOf("are having", "have", "were having", "had"),
            correctAnswer = "were having",
            explanation = "Geçmişte devam eden bir eylem (Past Continuous), araya giren kısa eylem (telefon çalması) ile kesilmiştir."
        ),
        EnglishQuestions(
            sentence = "By the time he arrived, I ___ the report.",
            options = listOf("finish", "had finished", "finished", "will finish"),
            correctAnswer = "had finished",
            explanation = "Geçmişteki bir eylemden (arrived) daha önce tamamlanmış başka bir eylem (Past Perfect) için kullanılır."
        ),
        EnglishQuestions(
            sentence = "Look! The children ___ in the garden.",
            options = listOf("play", "are playing", "played", "have played"),
            correctAnswer = "are playing",
            explanation = "Şu anda devam eden bir eylem (Present Continuous) için kullanılır."
        ),
        EnglishQuestions(
            sentence = "If it rains, we ___ at home.",
            options = listOf("stay", "will stay", "would stay", "stayed"),
            correctAnswer = "will stay",
            explanation = "Tip 1 Şart Cümlesi (Gerçekçi Durumlar): If + Simple Present, Future Simple."
        ),
        EnglishQuestions(
            sentence = "They ___ their new car next week.",
            options = listOf("buy", "are buying", "bought", "have bought"),
            correctAnswer = "are buying",
            explanation = "Yakın gelecekte kesinleşmiş planlar için Present Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "How long ___ you been waiting?",
            options = listOf("did", "have", "are", "do"),
            correctAnswer = "have",
            explanation = "Present Perfect Continuous (ne kadar süredir bekliyorsun) yapısı için 'have' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The sun ___ in the East.",
            options = listOf("is rising", "rose", "rises", "has risen"),
            correctAnswer = "rises",
            explanation = "Genel gerçekler ve bilimsel olaylar Simple Present Tense ile ifade edilir."
        ),
        EnglishQuestions(
            sentence = "I ___ to the gym every morning.",
            options = listOf("go", "am going", "went", "have gone"),
            correctAnswer = "go",
            explanation = "Tekrarlanan rutinler ve alışkanlıklar Simple Present Tense ile ifade edilir."
        ),

        // ********************* MODALS (KİPLER) *********************
        EnglishQuestions(
            sentence = "You ___ smoke here; it's prohibited.",
            options = listOf("mustn't", "don't have to", "couldn't", "can't"),
            correctAnswer = "mustn't",
            explanation = "Kesin yasaklama (prohibition) için 'mustn't' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ you pass me the salt, please?",
            options = listOf("Must", "Would", "Should", "Shall"),
            correctAnswer = "Would",
            explanation = "Kibar ricalar için 'Would' veya 'Could' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He ___ be very rich to afford that car.",
            options = listOf("should", "may", "must", "might"),
            correctAnswer = "must",
            explanation = "Güçlü çıkarım (deduction) için 'must' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I ___ have studied harder for the exam.",
            options = listOf("might", "should", "would", "must"),
            correctAnswer = "should",
            explanation = "Geçmişte yapılmamış bir şey için pişmanlık veya eleştiri (Should have V3) ifade eder."
        ),
        EnglishQuestions(
            sentence = "We ___ to buy milk today.",
            options = listOf("must", "have", "can", "might"),
            correctAnswer = "have",
            explanation = "Zorunluluk (Must'ın eş anlamlısı) 'have to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "It ___ rain later, so take an umbrella.",
            options = listOf("must", "can", "may", "should"),
            correctAnswer = "may",
            explanation = "Düşük olasılık (possibility) için 'may' veya 'might' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She ___ swim when she was five.",
            options = listOf("must", "can", "could", "should"),
            correctAnswer = "could",
            explanation = "Geçmişteki yetenek (past ability) için 'could' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ go if you don't want to.",
            options = listOf("mustn't", "don't have to", "can't", "shouldn't"),
            correctAnswer = "don't have to",
            explanation = "Zorunluluk olmaması (lack of necessity) için 'don't have to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "That ___ be the postman; he always comes at this time.",
            options = listOf("might", "can", "must", "should"),
            correctAnswer = "must",
            explanation = "Güçlü mantıksal çıkarım için 'must' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ have forgotten about the meeting.",
            options = listOf("should", "must", "might", "will"),
            correctAnswer = "might",
            explanation = "Geçmişe dair zayıf olasılık (Might have V3) ifade eder."
        ),

        // ********************* PASSIVE VOICE (EDİLGEN ÇATI) *********************
        EnglishQuestions(
            sentence = "The book ___ by millions of people.",
            options = listOf("reads", "is reading", "is read", "read"),
            correctAnswer = "is read",
            explanation = "Simple Present Passive (is/am/are + V3) yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "The bridge ___ last year.",
            options = listOf("built", "was built", "is building", "build"),
            correctAnswer = "was built",
            explanation = "Simple Past Passive (was/were + V3) yapısı (geçen yıl) kullanılır."
        ),
        EnglishQuestions(
            sentence = "A new road ___ now.",
            options = listOf("is being built", "has been built", "is built", "was being built"),
            correctAnswer = "is being built",
            explanation = "Present Continuous Passive (is/am/are + being + V3) (şu anda) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The house ___ before the storm came.",
            options = listOf("had been cleaned", "has been cleaned", "was cleaning", "cleaned"),
            correctAnswer = "had been cleaned",
            explanation = "Past Perfect Passive (had been + V3) yapısı (geçmişteki bir eylemden önce) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The report ___ by tomorrow morning.",
            options = listOf("will be finished", "is finished", "finishes", "will finish"),
            correctAnswer = "will be finished",
            explanation = "Future Simple Passive (will be + V3) yapısı (gelecekteki bir zamana kadar) kullanılır."
        ),

        // ********************* CONDITIONALS (ŞART CÜMLELERİ) *********************
        EnglishQuestions(
            sentence = "If I were rich, I ___ a yacht.",
            options = listOf("will buy", "would buy", "buy", "bought"),
            correctAnswer = "would buy",
            explanation = "Tip 2 Şart Cümlesi (Gerçek Dışı Durumlar): If + Simple Past, Would + V1."
        ),
        EnglishQuestions(
            sentence = "If you had told me, I ___ you.",
            options = listOf("would help", "will help", "would have helped", "helped"),
            correctAnswer = "would have helped",
            explanation = "Tip 3 Şart Cümlesi (Geçmişe Yönelik Pişmanlık): If + Past Perfect, Would have + V3."
        ),
        EnglishQuestions(
            sentence = "If you heat ice, it ___.",
            options = listOf("will melt", "melts", "melted", "would melt"),
            correctAnswer = "melts",
            explanation = "Zero Conditional (Bilimsel Gerçekler): If + Simple Present, Simple Present."
        ),
        EnglishQuestions(
            sentence = "I would have passed the exam if I ___ harder.",
            options = listOf("study", "studied", "had studied", "was studying"),
            correctAnswer = "had studied",
            explanation = "Tip 3 Şart Cümlesinin ana cümlesi verilmiş, yan cümle Past Perfect Tense olmalıdır."
        ),
        EnglishQuestions(
            sentence = "They ___ if you don't invite them.",
            options = listOf("are upset", "will be upset", "would be upset", "would have been upset"),
            correctAnswer = "will be upset",
            explanation = "Tip 1 Şart Cümlesi (Gerçekçi Durumlar): Sonuç cümlesi Future Simple Tense."
        ),

        // ********************* RELATIVE CLAUSES (İLGİ CÜMLECİKLERİ) *********************
        EnglishQuestions(
            sentence = "The man ___ spoke to me was a doctor.",
            options = listOf("which", "whose", "who", "where"),
            correctAnswer = "who",
            explanation = "İnsan öznesini nitelerken 'who' kullanılır."
        ),
        EnglishQuestions(
            sentence = "This is the house ___ I grew up.",
            options = listOf("which", "who", "where", "that"),
            correctAnswer = "where",
            explanation = "Yer adını nitelerken (içinde eylem gerçekleşiyorsa) 'where' kullanılır."
        ),
        EnglishQuestions(
            sentence = "That’s the book ___ cover is red.",
            options = listOf("which", "who", "whose", "that"),
            correctAnswer = "whose",
            explanation = "Sahiplik ilişkisi (kitabın kapağı) için 'whose' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The phone ___ was stolen was brand new.",
            options = listOf("who", "where", "which", "whose"),
            correctAnswer = "which",
            explanation = "Nesneyi (phone) nitelerken 'which' veya 'that' kullanılır."
        ),
        EnglishQuestions(
            sentence = "August is the month ___ most people go on holiday.",
            options = listOf("where", "when", "which", "whose"),
            correctAnswer = "when",
            explanation = "Zamanı (month) nitelerken 'when' kullanılır."
        ),

        // ********************* GERUNDS AND INFINITIVES (FİİLİMSİLER) *********************
        EnglishQuestions(
            sentence = "I enjoy ___ movies on the weekend.",
            options = listOf("to watch", "watch", "watching", "watched"),
            correctAnswer = "watching",
            explanation = "'Enjoy' fiili kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "She decided ___ for a new job.",
            options = listOf("apply", "to apply", "applying", "applied"),
            correctAnswer = "to apply",
            explanation = "'Decide' fiili kendisinden sonra Infinitive (to V1) alır."
        ),
        EnglishQuestions(
            sentence = "I regret ___ him the truth.",
            options = listOf("telling", "to tell", "told", "tell"),
            correctAnswer = "telling",
            explanation = "'Regret' pişmanlık anlamında kullanıldığında Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "We stopped ___ a quick coffee break.",
            options = listOf("to take", "taking", "take", "took"),
            correctAnswer = "to take",
            explanation = "Bir amaç belirtmek için 'stop' fiilinden sonra Infinitive (to V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ is good for your health.",
            options = listOf("To swim", "Swim", "Swimming", "Swam"),
            correctAnswer = "Swimming",
            explanation = "Cümlenin öznesi olarak fiil kullanıldığında Gerund (V-ing) kullanılır."
        ),

        // ********************* ADJECTIVES AND ADVERBS (SIFAT VE ZARFLAR) *********************
        EnglishQuestions(
            sentence = "He drives very ___.",
            options = listOf("careful", "carefully", "carefuller", "carefulest"),
            correctAnswer = "carefully",
            explanation = "Bir fiili (drives) nitelerken zarf (adverb, -ly) kullanılır."
        ),
        EnglishQuestions(
            sentence = "This is the ___ book I have ever read.",
            options = listOf("most interesting", "more interesting", "interesting", "interestingly"),
            correctAnswer = "most interesting",
            explanation = "En üstünlük derecesi (superlative) için 'the most' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The test was ___ than the previous one.",
            options = listOf("hard", "hardly", "harder", "hardest"),
            correctAnswer = "harder",
            explanation = "Karşılaştırma (comparative, than) için '-er' takısı veya 'more' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The student looks ___ after the final exam.",
            options = listOf("tiredly", "tired", "tiring", "tireless"),
            correctAnswer = "tired",
            explanation = "Duygu belirten eylemlerden sonra (look, feel, seem) sıfat kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is ___ tall as her brother.",
            options = listOf("so", "too", "as", "like"),
            correctAnswer = "as",
            explanation = "Eşitlik karşılaştırması için 'as...as' kalıbı kullanılır."
        ),

        // ********************* PREPOSITIONS (EDATLAR) *********************
        EnglishQuestions(
            sentence = "The keys are ___ the table.",
            options = listOf("at", "in", "on", "to"),
            correctAnswer = "on",
            explanation = "Bir yüzey üzerinde olma durumu için 'on' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The meeting is ___ 10 o'clock.",
            options = listOf("in", "on", "at", "by"),
            correctAnswer = "at",
            explanation = "Kesin saatler için 'at' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I am interested ___ learning Japanese.",
            options = listOf("in", "on", "at", "for"),
            correctAnswer = "in",
            explanation = "'Interested' sıfatı 'in' edatı ile kullanılır (interested in)."
        ),
        EnglishQuestions(
            sentence = "They traveled ___ train.",
            options = listOf("on", "with", "by", "at"),
            correctAnswer = "by",
            explanation = "Ulaşım araçlarını genel olarak ifade ederken 'by' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She graduated ___ university last year.",
            options = listOf("from", "of", "at", "by"),
            correctAnswer = "from",
            explanation = "'Mezun olmak' (graduate) fiili 'from' edatı ile kullanılır."
        ),

        // ********************* QUANTIFIERS (MİKTAR BELİRTEÇLERİ) *********************
        EnglishQuestions(
            sentence = "There is ___ milk left in the fridge.",
            options = listOf("many", "a lot", "few", "a little"),
            correctAnswer = "a little",
            explanation = "Sayılamayan isimler (milk) için 'a little' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I don't have ___ friends in this city.",
            options = listOf("much", "any", "some", "a little"),
            correctAnswer = "any",
            explanation = "Olumsuz cümlelerde (don't have) sayılabilen/sayılamayan isimler için 'any' kullanılır."
        ),
        EnglishQuestions(
            sentence = "We saw ___ beautiful sights on our trip.",
            options = listOf("much", "a little", "many", "none"),
            correctAnswer = "many",
            explanation = "Sayılabilen çoğul isimler (sights) için 'many' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ of the students failed the test.",
            options = listOf("Every", "Most", "Little", "Much"),
            correctAnswer = "Most",
            explanation = "Büyük bir kısmı belirtirken 'Most of' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Do you have ___ luggage?",
            options = listOf("many", "some", "much", "few"),
            correctAnswer = "much",
            explanation = "Sayılamayan isimler (luggage) için 'much' kullanılır (soru cümlesi)."
        ),

        // ********************* CONJUNCTIONS (BAĞLAÇLAR) *********************
        EnglishQuestions(
            sentence = "He is rich, ___ he is unhappy.",
            options = listOf("so", "because", "but", "and"),
            correctAnswer = "but",
            explanation = "Zıtlık ifade eden iki cümleyi bağlamak için 'but' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She studied hard, ___ she passed the exam.",
            options = listOf("although", "because", "so", "but"),
            correctAnswer = "so",
            explanation = "Sonuç bildiren iki cümleyi bağlamak için 'so' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I stayed home ___ I was sick.",
            options = listOf("although", "because", "so", "but"),
            correctAnswer = "because",
            explanation = "Sebep bildiren cümleciklerde 'because' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ it was raining, we went for a walk.",
            options = listOf("Despite", "Because", "Although", "So"),
            correctAnswer = "Although",
            explanation = "Zıtlık belirten cümlecikleri bağlamak için 'Although' kullanılır."
        ),
        EnglishQuestions(
            sentence = "We can either go to the cinema ___ stay at home.",
            options = listOf("or", "nor", "and", "but"),
            correctAnswer = "or",
            explanation = "Seçenek belirtmek için 'either...or' kalıbı kullanılır."
        ),

        // ********************* PHRASAL VERBS (DEYİMSEL FİİLLER) *********************
        EnglishQuestions(
            sentence = "Please ___ the loud music.",
            options = listOf("turn on", "turn down", "turn up", "turn off"),
            correctAnswer = "turn down",
            explanation = "Sesi kısmak anlamına gelen 'turn down' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I need to ___ the problem.",
            options = listOf("look up to", "look into", "look forward to", "look after"),
            correctAnswer = "look into",
            explanation = "Bir şeyi araştırmak, incelemek anlamına gelen 'look into' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She never ___ her promises.",
            options = listOf("gets away with", "gives up", "looks after", "gives in"),
            correctAnswer = "gives up",
            explanation = "Pes etmek/sözünden vazgeçmek anlamında kullanılır."
        ),
        EnglishQuestions(
            sentence = "They decided to ___ the wedding.",
            options = listOf("call off", "call up", "call out", "call in"),
            correctAnswer = "call off",
            explanation = "İptal etmek anlamına gelen 'call off' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He is trying to ___ the new rules.",
            options = listOf("put up with", "put on", "put away", "put off"),
            correctAnswer = "put up with",
            explanation = "Katlanmak/tahammül etmek anlamına gelen 'put up with' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I ___ finished cleaning the kitchen.",
            options = listOf("already", "just", "yet", "since"),
            correctAnswer = "just",
            explanation = "Kısa süre önce tamamlanmış eylemler için Present Perfect Tense ile 'just' kullanılır."
        ),
        EnglishQuestions(
            sentence = "This time next year, I ___ on a beach.",
            options = listOf("am relaxing", "will relax", "will be relaxing", "relax"),
            correctAnswer = "will be relaxing",
            explanation = "Gelecekte belirli bir zamanda devam eden bir eylem için Future Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "The train ___ at 8:00 AM.",
            options = listOf("leaves", "is leaving", "left", "will be leaving"),
            correctAnswer = "leaves",
            explanation = "Sabit programlar ve tarifeler Simple Present Tense ile ifade edilir (saat 8:00)."
        ),
        EnglishQuestions(
            sentence = "Before she moved to the city, she ___ in a small village.",
            options = listOf("is living", "has lived", "had lived", "lives"),
            correctAnswer = "had lived",
            explanation = "Geçmişteki bir eylemden (moved) daha önce tamamlanmış bir eylem Past Perfect Tense gerektirir."
        ),
        EnglishQuestions(
            sentence = "We ___ for three hours now.",
            options = listOf("have been talking", "talked", "were talking", "are talking"),
            correctAnswer = "have been talking",
            explanation = "'For three hours now' ifadesi, Present Perfect Continuous Tense gerektirir (üç saattir konuşuyoruz)."
        ),
        EnglishQuestions(
            sentence = "He didn't ___ to the party last night.",
            options = listOf("go", "went", "goes", "going"),
            correctAnswer = "go",
            explanation = "Simple Past Tense'de olumsuz cümle yapısında 'did' yardımcı fiilinden sonra fiilin yalın hali (V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The company ___ their new product by the end of the month.",
            options = listOf("is launching", "will have launched", "launches", "launched"),
            correctAnswer = "will have launched",
            explanation = "Gelecekte belirli bir zamana kadar tamamlanmış olacak eylemler için Future Perfect Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "While I ___ in the park, I saw an accident.",
            options = listOf("walked", "have walked", "was walking", "am walking"),
            correctAnswer = "was walking",
            explanation = "Geçmişte devam eden bir eylem (Past Continuous) 'while' ile, araya giren olay (saw) Simple Past ile bağlanır."
        ),
        EnglishQuestions(
            sentence = "I still haven't finished ___ my assignment.",
            options = listOf("to write", "writing", "wrote", "write"),
            correctAnswer = "writing",
            explanation = "'Finish' fiili kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "They ___ soccer when it started raining.",
            options = listOf("play", "are playing", "have played", "were playing"),
            correctAnswer = "were playing",
            explanation = "Geçmişte devam eden eylem (Past Continuous), Simple Past eylemiyle kesilmiştir."
        ),

        // ********************* REPORTED SPEECH (AKTARMA CÜMLELERİ) *********************
        EnglishQuestions(
            sentence = "She said that she ___ studying.",
            options = listOf("is", "was", "will be", "has been"),
            correctAnswer = "was",
            explanation = "Aktarma cümlesinde Present Continuous, Past Continuous'a dönüşür."
        ),
        EnglishQuestions(
            sentence = "He asked me ___ I would help him.",
            options = listOf("if", "that", "what", "where"),
            correctAnswer = "if",
            explanation = "Evet/Hayır sorusu aktarılırken 'if' veya 'whether' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The teacher told us ___ noise.",
            options = listOf("not to make", "don't make", "not make", "to not make"),
            correctAnswer = "not to make",
            explanation = "Emir kipi aktarılırken (olumsuz) 'not to + V1' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He explained that he ___ the job the previous day.",
            options = listOf("finishes", "finished", "had finished", "has finished"),
            correctAnswer = "had finished",
            explanation = "Simple Past (I finished) aktarılırken Past Perfect Tense'e dönüşür."
        ),
        EnglishQuestions(
            sentence = "They wanted to know ___ we were going.",
            options = listOf("if", "that", "what", "where"),
            correctAnswer = "where",
            explanation = "WH sorusu aktarılırken, aynı WH kelimesi kullanılır ve cümle düzene geçer."
        ),

        // ********************* PASSIVE VOICE (EDİLGEN ÇATI) - Devam *********************
        EnglishQuestions(
            sentence = "The documents ___ by the secretary.",
            options = listOf("are typing", "have been typed", "is typing", "was type"),
            correctAnswer = "have been typed",
            explanation = "Present Perfect Passive (has/have been + V3) yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "The accident could ___ by faster reaction.",
            options = listOf("have avoided", "have been avoided", "be avoiding", "avoid"),
            correctAnswer = "have been avoided",
            explanation = "Modal Perfect Passive (Modal + have been + V3) yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "He is expected ___ the competition.",
            options = listOf("to win", "winning", "win", "won"),
            correctAnswer = "to win",
            explanation = "Yapılacağı düşünülen eylemler için 'to be expected to + V1' pasif yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "The letters ___ tomorrow morning.",
            options = listOf("will deliver", "will be delivering", "will be delivered", "are delivering"),
            correctAnswer = "will be delivered",
            explanation = "Future Simple Passive (will be + V3) yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "The movie ___ to be very violent.",
            options = listOf("said", "is said", "is saying", "says"),
            correctAnswer = "is said",
            explanation = "Edilgen çatı (is/am/are + said to V1) yapısı kullanılır."
        ),

        // ********************* CONDITIONALS (ŞART CÜMLELERİ) - Devam *********************
        EnglishQuestions(
            sentence = "If I win the lottery, I ___ around the world.",
            options = listOf("travel", "will travel", "would travel", "traveled"),
            correctAnswer = "will travel",
            explanation = "Tip 1 Şart Cümlesi (Gerçekleşmesi olası): If + Simple Present, Future Simple."
        ),
        EnglishQuestions(
            sentence = "I wish I ___ play the piano.",
            options = listOf("can", "could", "would", "will"),
            correctAnswer = "could",
            explanation = "Şimdiki zamana dair gerçekleşmesi zor istekler için 'wish + Simple Past' kullanılır."
        ),
        EnglishQuestions(
            sentence = "If they had listened to the advice, they ___ in trouble now.",
            options = listOf("wouldn't be", "won't be", "aren't", "wouldn't have been"),
            correctAnswer = "wouldn't be",
            explanation = "Mixed Conditional (Karışık Tip): Geçmişteki şart (Past Perfect) şimdiki sonuçla (Would + V1) birleşir."
        ),
        EnglishQuestions(
            sentence = "You won't get better ___ you take the medicine.",
            options = listOf("if", "unless", "provided", "when"),
            correctAnswer = "unless",
            explanation = "'...olmadıkça' anlamına gelen 'unless' kullanılır."
        ),
        EnglishQuestions(
            sentence = "If I ___ you, I wouldn't accept that offer.",
            options = listOf("am", "was", "were", "would be"),
            correctAnswer = "were",
            explanation = "Tip 2 Şart Cümlesinde (gerçek dışı tavsiye) tüm özneler için 'were' kullanılır."
        ),

        // ********************* NOUN CLAUSES (İSİM CÜMLECİKLERİ) *********************
        EnglishQuestions(
            sentence = "I don't know ___ she left so early.",
            options = listOf("how", "that", "which", "why"),
            correctAnswer = "why",
            explanation = "'Neden' sorusunun cevabını veren İsim Cümlesi."
        ),
        EnglishQuestions(
            sentence = "The problem is ___ we have no money.",
            options = listOf("if", "that", "what", "how"),
            correctAnswer = "that",
            explanation = "'That' ile başlayan İsim Cümlesi, cümlenin tamamlayıcısı olarak kullanılır."
        ),
        EnglishQuestions(
            sentence = "Can you tell me ___ the bank is?",
            options = listOf("that", "how", "what", "where"),
            correctAnswer = "where",
            explanation = "Daha büyük bir cümlenin nesnesi olarak 'where' ile başlayan İsim Cümlesi."
        ),
        EnglishQuestions(
            sentence = "___ you said surprised me.",
            options = listOf("That", "What", "Which", "Why"),
            correctAnswer = "What",
            explanation = "Cümlenin öznesi olarak, içeriği bilinmeyen bir şeyi ifade etmek için 'What' kullanılır."
        ),
        EnglishQuestions(
            sentence = "It is certain ___ they will win.",
            options = listOf("if", "what", "that", "where"),
            correctAnswer = "that",
            explanation = "Özne yerine kullanılan 'it'ten sonra, esas özneyi bildiren 'that' İsim Cümlesi kullanılır."
        ),

        // ********************* INVERSION (DEVRİK CÜMLELER) *********************
        EnglishQuestions(
            sentence = "Hardly ever ___ such a brilliant performance.",
            options = listOf("I see", "I saw", "did I see", "have I seen"),
            correctAnswer = "have I seen",
            explanation = "Olumsuzluk zarfları cümlenin başında geldiğinde, genellikle Simple Present/Past, Present Perfect veya Past Perfect yapılarında devrik cümle kullanılır."
        ),
        EnglishQuestions(
            sentence = "Not only ___ talented, but he is also hardworking.",
            options = listOf("he is", "is he", "does he is", "he does"),
            correctAnswer = "is he",
            explanation = "'Not only' başta geldiğinde devrik cümle yapısı (yardımcı fiil + özne) kullanılır."
        ),
        EnglishQuestions(
            sentence = "Never ___ such a terrible storm.",
            options = listOf("they have seen", "have they seen", "they saw", "did they saw"),
            correctAnswer = "have they seen",
            explanation = "'Never' başta geldiğinde devrik cümle yapısı (Present Perfect) kullanılır."
        ),
        EnglishQuestions(
            sentence = "Under no circumstances ___ leave the building.",
            options = listOf("you should", "should you", "you will", "will you"),
            correctAnswer = "should you",
            explanation = "Kısıtlayıcı edat öbekleri başta geldiğinde devrik cümle kullanılır."
        ),
        EnglishQuestions(
            sentence = "Only when the music stopped ___ talking.",
            options = listOf("we started", "did we start", "we did start", "started we"),
            correctAnswer = "did we start",
            explanation = "'Only' başta geldiğinde ve zaman ifadesini nitelerken devrik cümle kullanılır."
        ),

        // ********************* COMPARISON (KARŞILAŞTIRMA) *********************
        EnglishQuestions(
            sentence = "The blue whale is ___ animal in the world.",
            options = listOf("larger", "large", "largest", "the largest"),
            correctAnswer = "the largest",
            explanation = "En üstünlük derecesi (superlative) için 'the + -est' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Learning English is ___ than learning French.",
            options = listOf("more difficult", "most difficult", "difficult", "difficulty"),
            correctAnswer = "more difficult",
            explanation = "Üç veya daha fazla heceli sıfatlarda karşılaştırma (comparative) için 'more' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She doesn't earn ___ money as her manager.",
            options = listOf("many", "much", "more", "a lot"),
            correctAnswer = "much",
            explanation = "Eşitlik karşılaştırması (as...as) olumsuz yapıda 'much' ile kullanılır (sayılamayan isim: money)."
        ),
        EnglishQuestions(
            sentence = "The faster you drive, ___ dangerous it becomes.",
            options = listOf("more", "the most", "the more", "most"),
            correctAnswer = "the more",
            explanation = "İki durum arasındaki doğru orantılı ilişkiyi ifade eden 'The + comparative, the + comparative' kalıbı."
        ),
        EnglishQuestions(
            sentence = "He is not ___ tall as his father.",
            options = listOf("so", "too", "as", "like"),
            correctAnswer = "as",
            explanation = "Eşitlik karşılaştırması için 'as...as' kalıbı kullanılır."
        ),

        // ********************* MODALS (KİPLER) - Devam *********************
        EnglishQuestions(
            sentence = "I ___ have done that; it was a mistake.",
            options = listOf("shouldn't", "mustn't", "can't", "won't"),
            correctAnswer = "shouldn't",
            explanation = "Geçmişte yapılmış bir eylem için pişmanlık veya eleştiri (Shouldn't have V3) ifade eder."
        ),
        EnglishQuestions(
            sentence = "She ___ be at home; the lights are off.",
            options = listOf("mustn't", "can't", "shouldn't", "might not"),
            correctAnswer = "can't",
            explanation = "Güçlü olumsuz çıkarım (imkansızlık) için 'can't' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ have gone to the party without telling anyone.",
            options = listOf("should", "must", "could", "would"),
            correctAnswer = "could",
            explanation = "Geçmişte bir olasılığı ifade ederken (gitme ihtimalleri vardı) 'could have V3' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ listen to the instructions carefully.",
            options = listOf("might", "must", "can", "may"),
            correctAnswer = "must",
            explanation = "Güçlü zorunluluk veya tavsiye için 'must' kullanılır."
        ),
        EnglishQuestions(
            sentence = "We ___ see the moon clearly tonight.",
            options = listOf("can", "must", "should", "would"),
            correctAnswer = "can",
            explanation = "Şimdiki zamandaki yetenek veya imkan için 'can' kullanılır."
        ),

        // ********************* MISCELLANEOUS (ÇEŞİTLİ) *********************
        EnglishQuestions(
            sentence = "I look forward ___ you soon.",
            options = listOf("to see", "seeing", "to seeing", "see"),
            correctAnswer = "to seeing",
            explanation = "'Look forward to' kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "He used ___ late, but now he goes early.",
            options = listOf("to stay up", "stay up", "staying up", "stayed up"),
            correctAnswer = "to stay up",
            explanation = "Geçmişteki alışkanlıklar için 'used to + V1' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Despite ___ hard, he failed the exam.",
            options = listOf("studying", "to study", "study", "studied"),
            correctAnswer = "studying",
            explanation = "'Despite' edatından sonra fiil kullanıldığında Gerund (V-ing) kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ of the two books is interesting.",
            options = listOf("All", "Both", "Each", "Every"),
            correctAnswer = "Each",
            explanation = "İki şeyin tekil olarak ele alınması ve tekil fiil (is) kullanılması için 'Each' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I'm accustomed ___ working long hours.",
            options = listOf("to work", "working", "to working", "work"),
            correctAnswer = "to working",
            explanation = "'Accustomed to' kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "There is ___ water in the bottle.",
            options = listOf("not much", "not many", "no much", "no many"),
            correctAnswer = "not much",
            explanation = "Sayılamayan isimler (water) için olumsuzlukta 'not much' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is the woman ___ car was stolen.",
            options = listOf("which", "who", "whose", "that"),
            correctAnswer = "whose",
            explanation = "Sahiplik ilişkisini belirten ilgi zamiri 'whose' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I would rather ___ home tonight.",
            options = listOf("staying", "to stay", "stay", "stayed"),
            correctAnswer = "stay",
            explanation = "'Would rather' kalıbından sonra fiilin yalın hali (bare infinitive) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The sooner, ___.",
            options = listOf("the better", "better", "the best", "good"),
            correctAnswer = "the better",
            explanation = "'The sooner, the better' (Ne kadar erken o kadar iyi) kalıbı."
        ),
        EnglishQuestions(
            sentence = "We are going to buy a new laptop, ___ is much faster.",
            options = listOf("that", "which", "what", "who"),
            correctAnswer = "which",
            explanation = "Virgülden sonra gelen ve ek bilgi veren ilgi cümleciğinde 'which' kullanılır (that kullanılmaz)."
        ),
        EnglishQuestions(
            sentence = "By the end of this month, I ___ in this company for ten years.",
            options = listOf("will work", "have worked", "will have been working", "work"),
            correctAnswer = "will have been working",
            explanation = "Gelecekteki belirli bir zamana kadar devam edecek ve o anda hala sürecek olan eylemler için Future Perfect Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "When I finally saw the movie, I realized I ___ it before.",
            options = listOf("saw", "have seen", "had seen", "was seeing"),
            correctAnswer = "had seen",
            explanation = "Geçmişteki bir eylemden (realized) daha önce gerçekleşmiş eylem için Past Perfect Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "I'm sure he ___ help you if you ask him nicely.",
            options = listOf("is", "will", "would", "must"),
            correctAnswer = "will",
            explanation = "Geleceğe dair tahminler veya anlık kararlar için Future Simple (will) kullanılır."
        ),
        EnglishQuestions(
            sentence = "He looks tired because he ___ all day.",
            options = listOf("worked", "works", "has been working", "is working"),
            correctAnswer = "has been working",
            explanation = "Geçmişte başlayıp hala devam eden veya sonucu şimdi görülen (yorgunluk) eylemler için Present Perfect Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "What ___ you ___ at 7 PM yesterday?",
            options = listOf("were/doing", "did/do", "are/doing", "have/done"),
            correctAnswer = "were/doing",
            explanation = "Geçmişte belirli bir zamanda (7 PM yesterday) devam eden eylem için Past Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "I heard the news ___ I was waiting for the bus.",
            options = listOf("during", "while", "as soon as", "since"),
            correctAnswer = "while",
            explanation = "İki eş zamanlı devam eden eylemi bağlamak için 'while' kullanılır (Past Continuous ile uyumludur)."
        ),
        EnglishQuestions(
            sentence = "Every year, the festival ___ place in June.",
            options = listOf("takes", "is taking", "took", "has taken"),
            correctAnswer = "takes",
            explanation = "Tekrarlanan olaylar ve takvimsel düzenlemeler Simple Present Tense gerektirir."
        ),
        EnglishQuestions(
            sentence = "They ___ the house since 2015.",
            options = listOf("own", "are owning", "have owned", "owned"),
            correctAnswer = "have owned",
            explanation = "2015'ten beri devam eden bir sahiplik durumu için Present Perfect Tense kullanılır (state fiili olduğu için continuous olmaz)."
        ),
        EnglishQuestions(
            sentence = "The meeting ___ as scheduled, despite the problems.",
            options = listOf("goes on", "went on", "has gone on", "is going on"),
            correctAnswer = "went on",
            explanation = "Geçmişte tamamlanmış bir eylemi anlattığı için Simple Past Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "Don't call me between 8 and 9; I ___ then.",
            options = listOf("will be studying", "study", "will study", "will have studied"),
            correctAnswer = "will be studying",
            explanation = "Gelecekteki belirli bir zaman aralığında devam edecek eylem için Future Continuous Tense kullanılır."
        ),

        // ********************* MODALS (KİPLER) - Devam *********************
        EnglishQuestions(
            sentence = "You ___ have told me you were coming!",
            options = listOf("must", "might", "should", "will"),
            correctAnswer = "should",
            explanation = "Geçmişte yapılmamış bir eylem için sitem/eleştiri (Should have V3) ifade eder."
        ),
        EnglishQuestions(
            sentence = "She ___ be lost; she knows the area well.",
            options = listOf("mustn't", "can't", "might not", "shouldn't"),
            correctAnswer = "can't",
            explanation = "Güçlü olumsuz çıkarım (imkansızlık) için 'can't' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ have forgotten to lock the door, but I doubt it.",
            options = listOf("must", "can't", "may", "will"),
            correctAnswer = "may",
            explanation = "Zayıf ihtimal veya olasılık için (may/might have V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ you mind helping me with this box?",
            options = listOf("Would", "Should", "Can", "Will"),
            correctAnswer = "Would",
            explanation = "Kibar rica kalıbı olan 'Would you mind + V-ing' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He ___ to get up early for his new job.",
            options = listOf("must", "has", "should", "will"),
            correctAnswer = "has",
            explanation = "Geniş zamanda dışsal zorunluluk (have to) için 'He has to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The parcel ___ arrive any minute now.",
            options = listOf("should", "must", "might have", "would"),
            correctAnswer = "should",
            explanation = "Yüksek olasılık veya beklenti (Şu anda gelmesi gerekir/muhtemeldir) için 'should' kullanılır."
        ),
        EnglishQuestions(
            sentence = "We ___ have gone to the meeting, but we chose not to.",
            options = listOf("must", "could", "would", "shall"),
            correctAnswer = "could",
            explanation = "Geçmişte var olan bir yeteneği veya seçeneği (gitme imkanımız vardı) belirtmek için 'could have V3' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I'd rather ___ a movie tonight.",
            options = listOf("to watch", "watching", "watch", "watched"),
            correctAnswer = "watch",
            explanation = "'Would rather' kalıbından sonra fiilin yalın hali (bare infinitive) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The children ___ be sleeping by now.",
            options = listOf("must", "may", "can", "will"),
            correctAnswer = "should", // Mantıksal beklenti
            explanation = "Beklenen bir eylemin gerçekleşmiş olması (Şu anda uyuyor olmaları gerekir) için 'should' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ stay, but it would be appreciated.",
            options = listOf("mustn't", "don't have to", "can't", "shouldn't"),
            correctAnswer = "don't have to",
            explanation = "Zorunluluğun olmaması (lack of necessity) için 'don't have to' kullanılır."
        ),

        // ********************* PHRASAL VERBS (DEYİMSEL FİİLLER) - Devam *********************
        EnglishQuestions(
            sentence = "Can you ___ the kids while I'm out?",
            options = listOf("look up", "look after", "look into", "look for"),
            correctAnswer = "look after",
            explanation = "Bebek bakıcılığı yapmak, birine bakmak anlamına gelen 'look after' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I need to ___ this new vocabulary in the dictionary.",
            options = listOf("look up", "look after", "look into", "look for"),
            correctAnswer = "look up",
            explanation = "Sözlükten veya kaynaktan bilgi aramak anlamına gelen 'look up' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Don't ___ the fire; it's getting too big!",
            options = listOf("put on", "put out", "put up", "put away"),
            correctAnswer = "put out",
            explanation = "Söndürmek anlamına gelen 'put out' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They decided to ___ the meeting until next week.",
            options = listOf("put on", "put out", "put off", "put away"),
            correctAnswer = "put off",
            explanation = "Ertelemek anlamına gelen 'put off' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I can't ___ that noise anymore!",
            options = listOf("put up with", "put up", "put down", "put out"),
            correctAnswer = "put up with",
            explanation = "Tahammül etmek, katlanmak anlamına gelen 'put up with' kullanılır."
        ),

        // ********************* PREPOSITIONS (EDATLAR) - Devam *********************
        EnglishQuestions(
            sentence = "I'll see you ___ the corner of the street.",
            options = listOf("in", "on", "at", "by"),
            correctAnswer = "at",
            explanation = "Belirli bir nokta veya köşe için 'at' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They got married ___ December.",
            options = listOf("on", "at", "in", "by"),
            correctAnswer = "in",
            explanation = "Ay veya yıl gibi uzun zaman dilimleri için 'in' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is afraid ___ spiders.",
            options = listOf("of", "from", "with", "about"),
            correctAnswer = "of",
            explanation = "'Afraid' sıfatı 'of' edatı ile kullanılır (afraid of)."
        ),
        EnglishQuestions(
            sentence = "We waited ___ the rain stopped.",
            options = listOf("since", "for", "until", "by"),
            correctAnswer = "until",
            explanation = "Bir eylemin bitiş noktasını belirtmek için 'until' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The factory is located ___ the river.",
            options = listOf("in", "at", "on", "beside"),
            correctAnswer = "beside",
            explanation = "Yanında, bitişiğinde anlamına gelen 'beside' kullanılır."
        ),

        // ********************* DETERMINERS/PRONOUNS (BELİRTEÇLER/ZAMİRLER) *********************
        EnglishQuestions(
            sentence = "___ person I asked knew the answer.",
            options = listOf("All", "Every", "Most", "Both"),
            correctAnswer = "Every",
            explanation = "Tekil sayılabilen isimlerle ve bütünü tek tek kastederken 'Every' kullanılır."
        ),
        EnglishQuestions(
            sentence = "We didn't see ___ interesting at the museum.",
            options = listOf("nothing", "something", "anything", "everything"),
            correctAnswer = "anything",
            explanation = "Olumsuz cümlelerde (didn't see) belgisiz zamir olarak 'anything' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I bought two shirts. ___ of them were black.",
            options = listOf("All", "Either", "Both", "Every"),
            correctAnswer = "Both",
            explanation = "İki şeyin tamamını belirtmek için 'Both' kullanılır."
        ),
        EnglishQuestions(
            sentence = "Can you give me ___ information about the course?",
            options = listOf("a few", "many", "some", "every"),
            correctAnswer = "some",
            explanation = "Saygıdeğer soru cümlelerinde (bilgi rica ederken) sayılamayan isimler (information) için 'some' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The dog hurt ___ when it fell.",
            options = listOf("itself", "himself", "its", "it"),
            correctAnswer = "itself",
            explanation = "Hayvanlar için dönüşlü zamir 'itself' kullanılır."
        ),

        // ********************* INVERSION AND CAUSATIVES (DEVRİK CÜMLE/ETTİRGEN YAPI) *********************
        EnglishQuestions(
            sentence = "Not until I apologized ___ leave the room.",
            options = listOf("did he", "he did", "he could", "could he"),
            correctAnswer = "did he",
            explanation = "'Not until' ile başlayan cümlede ana cümlede devrik yapı (Simple Past Tense için 'did + özne + V1') kullanılır."
        ),
        EnglishQuestions(
            sentence = "Seldom ___ so happy.",
            options = listOf("I have felt", "have I felt", "I felt", "did I feel"),
            correctAnswer = "have I felt",
            explanation = "Olumsuzluk zarfı 'Seldom' başta geldiğinde devrik yapı (Present Perfect Tense) kullanılır."
        ),
        EnglishQuestions(
            sentence = "She had her hair ___ at the salon.",
            options = listOf("cut", "cutting", "to cut", "cuts"),
            correctAnswer = "cut",
            explanation = "Ettirgen yapı (Causative: have + nesne + V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "I let him ___ my phone.",
            options = listOf("use", "to use", "using", "used"),
            correctAnswer = "use",
            explanation = "Ettirgen yapı (Causative: let + nesne + V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The manager made them ___ overtime.",
            options = listOf("work", "to work", "working", "worked"),
            correctAnswer = "work",
            explanation = "Ettirgen yapı (Causative: make + nesne + V1) kullanılır."
        ),

        // ********************* ADJECTIVES AND ADVERBS (SIFAT VE ZARFLAR) - Devam *********************
        EnglishQuestions(
            sentence = "It was a ___ decision to move abroad.",
            options = listOf("brave", "bravely", "braver", "bravest"),
            correctAnswer = "brave",
            explanation = "İsimden (decision) önce gelen sıfat kullanılır."
        ),
        EnglishQuestions(
            sentence = "She shouted at him ___.",
            options = listOf("angry", "angrier", "angrily", "anger"),
            correctAnswer = "angrily",
            explanation = "Bir fiili (shouted) nitelediği için zarf (adverb, -ly) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The price of petrol is getting ___ expensive.",
            options = listOf("more and more", "most and most", "too much", "more than"),
            correctAnswer = "more and more",
            explanation = "Giderek artan bir durumu ifade etmek için 'more and more + sıfat' kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "He looked ___ after he heard the news.",
            options = listOf("sadly", "sad", "sadden", "saddening"),
            correctAnswer = "sad",
            explanation = "Duygu belirten eylemlerden sonra (look) sıfat kullanılır."
        ),
        EnglishQuestions(
            sentence = "This bag is ___ cheaper than that one.",
            options = listOf("a bit", "much", "very", "so"),
            correctAnswer = "much",
            explanation = "Karşılaştırmalı sıfatları pekiştirmek için 'much' kullanılır (much cheaper)."
        ),

        // ********************* MISCELLANEOUS (ÇEŞİTLİ) - Devam *********************
        EnglishQuestions(
            sentence = "I am used ___ spicy food.",
            options = listOf("to eat", "to eating", "eat", "eaten"),
            correctAnswer = "to eating",
            explanation = "'Be used to' (alışkın olmak) kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "I object ___ treated unfairly.",
            options = listOf("to be", "being", "to being", "be"),
            correctAnswer = "to being",
            explanation = "'Object to' kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "He is said ___ a great singer.",
            options = listOf("be", "to be", "being", "to being"),
            correctAnswer = "to be",
            explanation = "Edilgen çatı (is/am/are + said to V1) yapısı kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ the poor service, the food was excellent.",
            options = listOf("Due to", "In spite of", "Because of", "Since"),
            correctAnswer = "In spite of",
            explanation = "Zıtlık belirten 'In spite of' (olmasına rağmen) edatı kullanılır."
        ),
        EnglishQuestions(
            sentence = "It was such ___ a boring day.",
            options = listOf("a", "an", "the", "—"),
            correctAnswer = "a",
            explanation = "'Such a/an + sıfat + tekil sayılabilen isim' kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "We must consider ___ the trip.",
            options = listOf("postpone", "to postpone", "postponing", "postponed"),
            correctAnswer = "postponing",
            explanation = "'Consider' fiili kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "I saw him ___ the street this morning.",
            options = listOf("cross", "to cross", "crossing", "crossed"),
            correctAnswer = "crossing",
            explanation = "Duyusal fiillerden (see, hear) sonra tüm eylemi kastedersek V1, devam eden eylemi kastedersek V-ing kullanılır. V-ing daha yaygındır."
        ),
        EnglishQuestions(
            sentence = "___ is the key to success.",
            options = listOf("Work hard", "Working hard", "To work hard", "Worked hard"),
            correctAnswer = "Working hard",
            explanation = "Cümle öznesi olarak Gerund (V-ing) kullanılır."
        ),
        EnglishQuestions(
            sentence = "The thieves broke into the house ___ the alarm went off.",
            options = listOf("as soon as", "until", "while", "though"),
            correctAnswer = "as soon as",
            explanation = "İki eylemin hemen art arda gerçekleştiğini belirtmek için 'as soon as' kullanılır."
        ),
        EnglishQuestions(
            sentence = "This project is too difficult ___ by myself.",
            options = listOf("to complete", "completing", "complete", "for complete"),
            correctAnswer = "to complete",
            explanation = "'Too + sıfat + to V1' olumsuzluk belirten kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "I'm sorry, I ___ paying attention to what you were saying.",
            options = listOf("am not", "don't", "was not", "haven't been"),
            correctAnswer = "was not",
            explanation = "Geçmişte devam eden bir eylemin (sen konuşurken) o sırada yapılmadığını belirtir (Past Continuous Tense)."
        ),
        EnglishQuestions(
            sentence = "When she found the key, she realized someone ___ the door.",
            options = listOf("locks", "was locking", "had locked", "is locking"),
            correctAnswer = "had locked",
            explanation = "Ana eylemden (found) daha önce tamamlanmış bir eylem Past Perfect Tense gerektirir."
        ),
        EnglishQuestions(
            sentence = "We ___ the final preparations by midnight.",
            options = listOf("are making", "will be making", "will have made", "make"),
            correctAnswer = "will have made",
            explanation = "Gelecekteki belirli bir zamana kadar tamamlanmış olacak eylemler için Future Perfect Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "The machine ___ well since the technician fixed it.",
            options = listOf("doesn't work", "hasn't been working", "didn't work", "isn't working"),
            correctAnswer = "hasn't been working",
            explanation = "Geçmişteki bir zamandan (fixed it) bu yana devam eden durumu belirtmek için Present Perfect Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "She ___ three books this year, and it's only July.",
            options = listOf("wrote", "writes", "has written", "is writing"),
            correctAnswer = "has written",
            explanation = "Devam eden bir zaman diliminde (this year) tamamlanmış sayılabilecek eylemler için Present Perfect Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "I think the weather ___ great tomorrow.",
            options = listOf("is", "will be", "is being", "was"),
            correctAnswer = "will be",
            explanation = "Kişisel fikirlere dayalı geleceğe dair tahminler için Future Simple (will) kullanılır."
        ),
        EnglishQuestions(
            sentence = "As soon as he arrives, we ___ dinner.",
            options = listOf("start", "will start", "would start", "started"),
            correctAnswer = "will start",
            explanation = "Zaman bağlaçlarından (as soon as, when, after) sonra Present Tense kullanılırken, ana cümlede Future Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ you ever eaten sushi before?",
            options = listOf("Did", "Do", "Are", "Have"),
            correctAnswer = "Have",
            explanation = "Hayat deneyimini sormak için Present Perfect Tense (Have + V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ the movie for ten minutes when the power went out.",
            options = listOf("watch", "were watching", "had been watching", "have watched"),
            correctAnswer = "had been watching",
            explanation = "Geçmişteki bir eylemden (power went out) önce ne kadar süredir devam ettiğini belirtmek için Past Perfect Continuous Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "The government ___ a new law next month.",
            options = listOf("is introducing", "introduced", "introduces", "introduce"),
            correctAnswer = "is introducing",
            explanation = "Kesinleşmiş, yakın gelecekteki resmi planlar için Present Continuous Tense kullanılır."
        ),

        // ********************* MODALS (KİPLER) - Devam *********************
        EnglishQuestions(
            sentence = "We ___ to call before visiting.",
            options = listOf("must", "should", "ought", "may"),
            correctAnswer = "ought",
            explanation = "Güçlü bir tavsiye veya yükümlülük (should'a benzer) için 'ought to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ have been sleeping when I called; I heard snoring!",
            options = listOf("must", "might", "could", "would"),
            correctAnswer = "must",
            explanation = "Geçmişe dair güçlü çıkarım/mantıksal zorunluluk (Must have been V-ing) için kullanılır."
        ),
        EnglishQuestions(
            sentence = "She ___ play the violin quite well.",
            options = listOf("is able", "able to", "is able to", "can"),
            correctAnswer = "can",
            explanation = "Genel yetenek bildiren modal fiil 'can' kullanılır."
        ),
        EnglishQuestions(
            sentence = "He ___ come, but I'm not sure.",
            options = listOf("must", "should", "may", "will"),
            correctAnswer = "may",
            explanation = "Düşük olasılık veya belirsizlik için 'may' (veya 'might') kullanılır."
        ),
        EnglishQuestions(
            sentence = "I wish I ___ speak French fluently.",
            options = listOf("can", "could", "would", "might"),
            correctAnswer = "could",
            explanation = "Şimdiki zamana dair değişmesini istediğimiz durumlar için 'wish + could' kullanılır."
        ),
        EnglishQuestions(
            sentence = "You ___ worry about the payment; it's handled.",
            options = listOf("mustn't", "don't have to", "can't", "shouldn't"),
            correctAnswer = "don't have to",
            explanation = "Gerekliliğin olmaması (lack of necessity) için 'don't have to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ have seen the sign, otherwise they wouldn't have gone that way.",
            options = listOf("must", "can't", "shouldn't", "might"),
            correctAnswer = "can't",
            explanation = "Güçlü olumsuz mantıksal çıkarım (Görmüş olamazlar) için 'can't have V3' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ I close the window for you?",
            options = listOf("Will", "Would", "Shall", "Must"),
            correctAnswer = "Shall",
            explanation = "Teklif veya öneri (özellikle I/We ile) için 'Shall I/we' kullanılır."
        ),
        EnglishQuestions(
            sentence = "They ___ to finish the project by Friday.",
            options = listOf("must", "have", "can", "should"),
            correctAnswer = "have",
            explanation = "Zorunluluk (have to) için kullanılır (They have to)."
        ),
        EnglishQuestions(
            sentence = "You ___ submit the forms immediately.",
            options = listOf("may", "could", "had better", "would"),
            correctAnswer = "had better",
            explanation = "Acil ve güçlü tavsiye/uyarılar için 'had better + V1' kullanılır."
        ),

        // ********************* TAG QUESTIONS (EK SORULAR) *********************
        EnglishQuestions(
            sentence = "He is coming to the party, ___?",
            options = listOf("is he", "isn't he", "does he", "doesn't he"),
            correctAnswer = "isn't he",
            explanation = "Ana cümle olumlu (is coming), ek soru olumsuz olmalı (isn't he)."
        ),
        EnglishQuestions(
            sentence = "You don't like coffee, ___?",
            options = listOf("do you", "don't you", "are you", "aren't you"),
            correctAnswer = "do you",
            explanation = "Ana cümle olumsuz (don't like), ek soru olumlu olmalı (do you)."
        ),
        EnglishQuestions(
            sentence = "Let's go to the beach, ___?",
            options = listOf("do we", "shall we", "will we", "can we"),
            correctAnswer = "shall we",
            explanation = "'Let's' ile başlayan önerilerde ek soru olarak her zaman 'shall we' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She has finished her homework, ___?",
            options = listOf("has she", "isn't she", "hasn't she", "didn't she"),
            correctAnswer = "hasn't she",
            explanation = "Ana cümle Present Perfect (has finished), ek soru olumsuz olmalı (hasn't she)."
        ),
        EnglishQuestions(
            sentence = "Nobody called, ___?",
            options = listOf("did they", "didn't they", "does they", "doesn't they"),
            correctAnswer = "did they",
            explanation = "Olumsuz anlam taşıyan özneler (Nobody) için olumlu ek soru ve 'they' zamiri kullanılır."
        ),

        // ********************* USED TO / BE USED TO / GET USED TO *********************
        EnglishQuestions(
            sentence = "I am slowly ___ the cold weather.",
            options = listOf("used to", "use to", "getting used to", "used to be"),
            correctAnswer = "getting used to",
            explanation = "Alışma sürecini (slowly) ifade etmek için 'get used to + V-ing' yapısının Continuous hali kullanılır."
        ),
        EnglishQuestions(
            sentence = "He ___ go fishing every summer when he was young.",
            options = listOf("is used to", "used to", "get used to", "getting used to"),
            correctAnswer = "used to",
            explanation = "Geçmişteki bitmiş bir alışkanlığı (eski zamanlarda) ifade etmek için 'used to + V1' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is ___ working long hours.",
            options = listOf("used to", "use to", "get used to", "getting used"),
            correctAnswer = "used to",
            explanation = "Mevcut duruma alışkın olmayı ifade etmek için 'be used to + V-ing' kullanılır (working V-ing olduğu için)."
        ),
        EnglishQuestions(
            sentence = "We didn't ___ live in the city center.",
            options = listOf("used to", "use to", "using to", "get used to"),
            correctAnswer = "use to",
            explanation = "Olumsuz 'used to' yapısında 'did' yardımcı fiili kullanıldığından 'used to' yerine 'use to' kullanılır."
        ),
        EnglishQuestions(
            sentence = "It took me a month to ___ the new diet.",
            options = listOf("used to", "be used to", "get used to", "to get used to"),
            correctAnswer = "get used to",
            explanation = "Zorunluluk (took me a month) ve alışma sürecini belirtmek için 'to get used to' kullanılır (Simple Past olarak ifade edilmiştir)."
        ),

        // ********************* CAUSATIVES (ETTİRGEN YAPI) - Devam *********************
        EnglishQuestions(
            sentence = "I need to get the documents ___ by the manager.",
            options = listOf("sign", "signed", "to sign", "signing"),
            correctAnswer = "signed",
            explanation = "Ettirgen yapı (Causative: get + nesne + V3) kullanılır."
        ),
        EnglishQuestions(
            sentence = "She made her brother ___ the dishes.",
            options = listOf("do", "doing", "to do", "done"),
            correctAnswer = "do",
            explanation = "Ettirgen yapı (Causative: make + nesne + V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "We had the plumber ___ the sink.",
            options = listOf("fix", "fixed", "to fix", "fixing"),
            correctAnswer = "fix",
            explanation = "Ettirgen yapı (Causative: have + nesne + V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "I couldn't help ___ when I heard the joke.",
            options = listOf("laugh", "to laugh", "laughing", "but laugh"),
            correctAnswer = "laughing",
            explanation = "'Can't help' (kendini alamamak) kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "The witness was seen ___ the building.",
            options = listOf("enter", "entered", "to enter", "entering"),
            correctAnswer = "entering",
            explanation = "Edilgen çatıdaki duyusal fiillerden sonra (was seen) ya V1 ya da V-ing kullanılır. V-ing devam eden eylemi vurgular."
        ),

        // ********************* ARTICLES (TAMLAMALAR) *********************
        EnglishQuestions(
            sentence = "___ sun rises in ___ east.",
            options = listOf("The/the", "A/the", "The/a", "—/the"),
            correctAnswer = "The/the",
            explanation = "Tek olan nesneler (sun) ve yönler (east) için 'the' kullanılır."
        ),
        EnglishQuestions(
            sentence = "She is ___ best student in the class.",
            options = listOf("a", "an", "the", "—"),
            correctAnswer = "the",
            explanation = "En üstünlük derecesi (superlative) sıfatlarından önce 'the' kullanılır."
        ),
        EnglishQuestions(
            sentence = "I would like ___ cup of coffee, please.",
            options = listOf("a", "an", "the", "—"),
            correctAnswer = "a",
            explanation = "Genel ve tekil sayılabilen bir isimden önce 'a' kullanılır."
        ),
        EnglishQuestions(
            sentence = "___ honesty is ___ best policy.",
            options = listOf("The/the", "A/—", "—/the", "The/—"),
            correctAnswer = "—/the",
            explanation = "Soyut isimler (honesty) genellikle artikelsiz kullanılırken, 'best policy' kuralı gereği 'the' alır."
        ),
        EnglishQuestions(
            sentence = "He is ___ heir to a large fortune.",
            options = listOf("a", "an", "the", "—"),
            correctAnswer = "an",
            explanation = "Sessiz harfle yazılsa bile, sesli harf ile okunan (heir -> eır) kelimeden önce 'an' kullanılır."
        ),

        // ********************* RELATIVE CLAUSES (İLGİ CÜMLECİKLERİ) - Devam *********************
        EnglishQuestions(
            sentence = "That's the reason ___ I left early.",
            options = listOf("which", "where", "why", "who"),
            correctAnswer = "why",
            explanation = "Sebep bildiren isimlerden (reason) sonra 'why' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The person ___ I trust most is my mother.",
            options = listOf("who", "which", "whom", "whose"),
            correctAnswer = "whom",
            explanation = "İnsan nesnesini nitelerken resmi dilde 'whom' kullanılır (gayri resmi dilde 'who' veya atlanabilir)."
        ),
        EnglishQuestions(
            sentence = "She is wearing a dress, the color ___ is blue.",
            options = listOf("who", "of which", "which", "that"),
            correctAnswer = "of which",
            explanation = "Sahiplik ilişkisini (elbisenin rengi) belirtirken 'of which' kullanılır (non-defining clause)."
        ),
        EnglishQuestions(
            sentence = "The time ___ we met was memorable.",
            options = listOf("where", "when", "which", "that"),
            correctAnswer = "when",
            explanation = "Zamanı (time) nitelerken 'when' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The student ___ homework was missing got a zero.",
            options = listOf("who", "whose", "which", "that"),
            correctAnswer = "whose",
            explanation = "Sahiplik ilişkisi (öğrencinin ödevi) için 'whose' kullanılır."
        ),

        // ********************* MISCELLANEOUS (ÇEŞİTLİ) - Devam *********************
        EnglishQuestions(
            sentence = "I'd rather you ___ the car tomorrow.",
            options = listOf("wash", "washed", "will wash", "to wash"),
            correctAnswer = "washed",
            explanation = "'I'd rather' (tercih etmek) kalıbı, başkasının eylemini belirtirken Simple Past Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "He behaved as if he ___ everything about the subject.",
            options = listOf("knows", "knew", "has known", "will know"),
            correctAnswer = "knew",
            explanation = "Gerçek dışı veya abartılı karşılaştırma (as if/as though) için Simple Past Tense kullanılır."
        ),
        EnglishQuestions(
            sentence = "Neither John ___ Mary came to the party.",
            options = listOf("or", "nor", "and", "but"),
            correctAnswer = "nor",
            explanation = "Olumsuz ikili bağlaç 'Neither...nor' kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "She left the lights on, ___ was careless of her.",
            options = listOf("that", "which", "what", "who"),
            correctAnswer = "which",
            explanation = "Cümlenin tamamını niteleyen bir ilgi cümleciği başlatmak için 'which' kullanılır (virgülden sonra)."
        ),
        EnglishQuestions(
            sentence = "If only I ___ her address!",
            options = listOf("know", "knew", "had known", "would know"),
            correctAnswer = "knew",
            explanation = "Şimdiki zamana dair güçlü bir dileği (keşke bilseydim) ifade etmek için 'If only + Simple Past Tense' kullanılır."
        ),
        EnglishQuestions(
            sentence = "The children are looking forward ___ the zoo.",
            options = listOf("visit", "to visit", "visiting", "to visiting"),
            correctAnswer = "to visiting",
            explanation = "'Look forward to' kalıbı kendisinden sonra Gerund (V-ing) alır."
        ),
        EnglishQuestions(
            sentence = "It is high time you ___ for yourself.",
            options = listOf("stand up", "standed up", "stood up", "have stood up"),
            correctAnswer = "stood up",
            explanation = "Bir şeyin yapılması gereken doğru zamanı ifade eden 'It is (high) time + Simple Past Tense' kalıbı kullanılır."
        ),
        EnglishQuestions(
            sentence = "She prevented me ___ making a terrible mistake.",
            options = listOf("to make", "from making", "making", "make"),
            correctAnswer = "from making",
            explanation = "'Prevent' (engellemek) fiili 'from + V-ing' edatıyla kullanılır."
        ),
        EnglishQuestions(
            sentence = "It was so cold that we could ___ our breath.",
            options = listOf("see", "to see", "seeing", "seen"),
            correctAnswer = "see",
            explanation = "'Could' modalından sonra fiilin yalın hali (V1) kullanılır."
        ),
        EnglishQuestions(
            sentence = "They denied ___ the money.",
            options = listOf("to steal", "stealing", "stole", "stolen"),
            correctAnswer = "stealing",
            explanation = "'Deny' fiili kendisinden sonra Gerund (V-ing) alır."
        )
    )