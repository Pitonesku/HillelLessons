package com.company.HomeTask12;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleSquare implements MenuItem{
    public CircleSquare (Scanner sc) {
        this.sc = sc;
    }
    Scanner sc;

    @Override
    public String getName() {
        return "Circle square";
    }

    @Override
    public void run() {
        System.out.println("Enter the circle radius:");
        int userInput = sc.nextInt();
        double circleSquare = userInput*userInput*PI;
        System.out.printf("Circle square is %.2f \n", circleSquare);
    }

}
