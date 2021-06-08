package com.company.HomeTask8;


import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        
        //The best QUIZ ever

        final int AMOUNT_OF_QUESTION = 3;
        Scanner sc = new Scanner(System.in);

        UserAnswer[] setOfUserAnswers = new UserAnswer[AMOUNT_OF_QUESTION];

        double correctAnswers = 0;


        for (int i = 0; i < AMOUNT_OF_QUESTION; i++) {
            Question question = new Question(ListOfQuestions.listOfQuestions[i][0], ListOfQuestions.listOfQuestions[i][1],
                    ListOfQuestions.listOfQuestions[i][2], ListOfQuestions.listOfQuestions[i][3], ListOfQuestions.listOfQuestions[i][4],
                    Integer.parseInt(ListOfQuestions.listOfQuestions[i][5]));
            System.out.println(question.toString());

            UserAnswer userAnswer = new UserAnswer(question, sc.nextInt());
            setOfUserAnswers[i] = userAnswer;

            if (setOfUserAnswers[i].isAnswerCorrect()) {
                correctAnswers++;
            }

        }

        double score = correctAnswers / AMOUNT_OF_QUESTION * 100;

        System.out.printf("Вы ответили верно на %.0f вопросов из %d. \n" +
                "Ваша оценка %.0f баллов.\n", correctAnswers, AMOUNT_OF_QUESTION, score);
        if (correctAnswers < AMOUNT_OF_QUESTION)
            System.out.println("Ниже приведен перечень вопсосов с неверными ответами.");
        System.out.println("=============================");


        for (int i = 0; i < AMOUNT_OF_QUESTION; i++) {
            if (!setOfUserAnswers[i].isCorrect) {
                System.out.println(setOfUserAnswers[i].question.getQuestion());
                System.out.println("Ваш ответ: \n" + setOfUserAnswers[i].userAnswer + "." +
                        setOfUserAnswers[i].question.getAnswer(setOfUserAnswers[i].userAnswer-1));

                String rightAnswer = setOfUserAnswers[i].question.getAnswers()[setOfUserAnswers[i].question.getRightAnswerNumber() -1];
                System.out.println("Верный ответ: \n" + rightAnswer);
                System.out.println("=========================");
            }
        }


    }

}
