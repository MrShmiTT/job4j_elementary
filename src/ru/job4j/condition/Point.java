package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y1 - y2;
        double first = Math.pow(a, 2);
        double second = Math.pow(b, 2);
        a = first + second;
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double result = Point.distance(x1, x2, y1, y2);
        System.out.println("result (" + x1 + ", " + x2 + ") to (" + y1 + ", " + y2 + ") " + result);
    }
}