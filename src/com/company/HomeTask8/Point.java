package com.company.HomeTask8;

public class Point {
    private double x; // координата точки по оси х;
    private double y; // координата точки по оси у;
    private double dist; // расстояние до другой точки

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Метод рассчитывае расстояние между двумя точками в двухмерной системе координат;
     * @param x координата х точки до которой неообходимо вычислить расстояние;
     * @param y координата у точки до которой неообходимо вычислить расстояние;
     * @return возвращает расстояние между двумя точкамиж
     */
    public double distanceTo (Point point) {
        dist = Math.sqrt((this.x - point.x)*(this.x - point.x) + (this.y - point.y)*(this.y-point.y));
        return dist;
    }
}

