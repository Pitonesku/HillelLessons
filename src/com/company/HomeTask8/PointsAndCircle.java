package com.company.HomeTask8;


import java.util.Scanner;

public class PointsAndCircle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FigureMaker maker = new FigureMaker(sc);


        System.out.println("The program will check does the point belongs to the circle.");
        System.out.println("How many points would you like to check?");
        final int POINTS_AMOUNT = sc.nextInt();
        Double[][] pointsInTheCircle = new Double[POINTS_AMOUNT+1][2];

                Circle circle = maker.circleMaker(sc);
        System.out.printf("You created the circle with center in coordinates x = %.2f, y = %.2f and radius = %.2f\n" ,
                circle.getCenter().getX(), circle.getCenter().getX(), circle.getRadius());
        System.out.println("=====================================");
        System.out.println("Lets check the points.");

        for (int i = 1; i <= POINTS_AMOUNT; i++) {
            System.out.println("Point number " + i + ":");
            Point p = maker.pointMaker(sc);
            if (circle.isPointBelongTo(p)) {
                pointsInTheCircle[i][0] = p.getX();
                pointsInTheCircle[i][1] =p.getY();
           //     System.out.printf("The point x=%.2f y=%.2f belongs to the circle\n", p.getX(), p.getY());
            }
          //  else System.out.printf("The point x=%.2f y=%.2f DOES NOT belong to the circle\n", p.getX(), p.getY());
            System.out.println("=====================================");
        }

        for (int i = 1; i <= POINTS_AMOUNT; i++) {
            if(pointsInTheCircle[i][0] == null) continue;
            System.out.printf("The point x=%.2f y=%.2f belongs to the circle\n", pointsInTheCircle[i][0],pointsInTheCircle[i][1]);

        }
    }

}
