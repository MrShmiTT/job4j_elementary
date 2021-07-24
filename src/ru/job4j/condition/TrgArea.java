package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double z = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(z);
    }

    public static void main(String[] args) {
        double a = 2.0;
        double b = 2.0;
        double c = 2.0;
        double s = TrgArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + " = " + s);
    }

}
