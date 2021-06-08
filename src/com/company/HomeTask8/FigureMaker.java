package com.company.HomeTask8;

import java.util.Scanner;

public class FigureMaker {
    private  Scanner sc;

    public FigureMaker (Scanner sc) {
        this.sc = sc;
    }

    public Point pointMaker (Scanner sc) {
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        System.out.println("Enter y:");
        double y = sc.nextDouble();
        return new Point(x,y);
        }

        public Circle circleMaker(Scanner sc) {
            System.out.println("Creating the circle. Please enter the center ");
            Point center  = pointMaker(sc);
            System.out.println("Enter the radius:");
            double radius = sc.nextDouble();
            return new Circle(radius, center);
    }

}
