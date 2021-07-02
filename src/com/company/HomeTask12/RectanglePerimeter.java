package com.company.HomeTask12;

import java.util.Scanner;

public class RectanglePerimeter implements MenuItem {

    public RectanglePerimeter(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc;

    @Override
    public String getName() {
        return "Rectangle perimeter";
    }

    @Override
    public void run() {
        System.out.println("Enter width of rectangle:");
        int width = sc.nextInt();
        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();
        int rectanglePerimeter = (width+length)*2;
        System.out.printf("The rectangle square is %d\n", rectanglePerimeter);
    }
}
