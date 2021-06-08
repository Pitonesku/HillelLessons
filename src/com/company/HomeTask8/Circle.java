package com.company.HomeTask8;

public class Circle {
   private double radius;
    private Point center;


    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }

    public boolean isPointBelongTo (Point point) {
        return (point.distanceTo(center) <= radius);
    }
}
