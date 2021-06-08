package com.company.HomeTask8;


public class UserAnswer {

   public UserAnswer (Question question, int userAnswer) {
      this.question = question;
      this.userAnswer = userAnswer;
     }

   Question question;
   int userAnswer;
   boolean isCorrect;

   public boolean isAnswerCorrect () {
      isCorrect = question.getRightAnswerNumber() == userAnswer;
      return isCorrect;
   }
}
