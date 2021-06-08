package com.company.HomeTask8;


import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        int amountOfInput = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please start to enter the values. Press 0 to exit.");

       for (;;){
           int input = sc.nextInt();
           if (input == 0) break;
           else {
               sum += input;
               amountOfInput++;
           }
       }
        double average = (double) sum/amountOfInput;
        System.out.printf("The average is %.2f ", average);

    }
}
