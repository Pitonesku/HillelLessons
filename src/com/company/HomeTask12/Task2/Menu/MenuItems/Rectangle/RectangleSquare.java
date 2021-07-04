package com.company.HomeTask12.Task2.Menu.MenuItems.Rectangle;

import com.company.HomeTask12.Task2.Menu.MenuItem;

import java.util.Scanner;

public class RectangleSquare implements MenuItem {

    public RectangleSquare(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc;

    @Override
    public String getName() {
        return "Rectangle square";
    }

    @Override
    public void run() {
        System.out.println("Enter width of rectangle:");
        int width = sc.nextInt();
        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();
        int rectangleSquare = width*length;
        System.out.printf("The rectangle square is %d\n", rectangleSquare);
    }
}
