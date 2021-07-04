package com.company.HomeTask12.Task2.Menu.MenuItems.Circle;

import com.company.HomeTask12.Task2.Menu.MenuItem;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleLength implements MenuItem {
    public CircleLength(Scanner sc) {
        this.sc = sc;
    }
    Scanner sc;

    @Override
    public String getName() {
        return "Circle length";
    }

    @Override
    public void run() {
        System.out.println("Enter the circle radius:");
        int userInput = sc.nextInt();
        double circleLength = 2*userInput*PI;
        System.out.printf("Circle square is %.2f \n", circleLength);
    }

}
