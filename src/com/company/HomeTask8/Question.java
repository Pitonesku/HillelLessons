package com.company.HomeTask8;


import java.util.Arrays;


public class Question {
    static int questionTotal = 0;


    public Question(String question, String answer1, String answer2, String answer3, String answer4, int rightAnswerNumber) {
        this.question = question;
        this.answers[0] = answer1;
        this.answers[1] = answer2;
        this.answers[2] = answer3;
        this.answers[3] = answer4;
        this.rightAnswerNumber = rightAnswerNumber;
        questionTotal++;
    }

    private String question;

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }


    private String[] answers = new String[4];

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String[] getAnswers() {
        return answers;
    }

    private int rightAnswerNumber;

    public void setRightAnswerNumber(int rightAnswerNumber) {
        this.rightAnswerNumber = rightAnswerNumber;
    }

    public int getRightAnswerNumber() {
        return rightAnswerNumber;
    }


    public String getAnswer(int i) {
        return answers[i];
    }


    @Override
    public String toString() {
        return question + "\n"
                + "1. " + answers[0] + "\n"
                + "2. " + answers[1] + "\n"
                + "3. " + answers[2] + "\n"
                + "4. " + answers[3] + "\n"
                + "Выберите свой вариант ответа:";
    }
}

