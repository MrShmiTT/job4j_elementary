package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = SqArea.square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + result);
    }
}