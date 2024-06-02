package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants{

    const val USER_NAME= "user_name"
    const val TOTAL_QUESTIONS="total_questions"
    const val SCORE="correct_answers"

    fun getQuestions():MutableList<Question>{
        val questions= mutableListOf<Question>()

        val quest1 = Question(
            1,"What country does this flag belong?",
            R.drawable.images,"Germany",
            "india","Iran","None of the above",
            4

        )
        questions.add(quest1)

        val quest2 = Question(
            2,"What country does this flag belong?",
            R.drawable.images2,"Germany",
            "india","Iran","Ireland",
            1

        )
        questions.add(quest2)

        val quest3 = Question(
            3,"What country does this flag belong?",
            R.drawable.franceflag,"Italy",
            "india","France","Spain",
            3

        )
        questions.add(quest3)

        val quest4 = Question(
            4,"What country does this flag belong?",
            R.drawable.indiaimage,"France",
            "America","India","Russia",
            3

        )
        questions.add(quest4)

        val quest5 = Question(
            5,"What country does this flag belong?",
            R.drawable.nigeriaflag,"Romania",
            "Philippines","Israel","Nigeria",
            4

        )
        questions.add(quest5)

        val quest6 = Question(
            6,"What country does this flag belong?",
            R.drawable.romaniaflag,"Romania",
            "India","Israel","Philippines",
            1

        )
        questions.add(quest6)

        val quest7 = Question(
            1,"Which state did america buy from russia?",
            R.drawable.usamap2,"Texas",
            "New york","California","Alaska",
            4

        )
        questions.add(quest7)


        return questions
    }

}