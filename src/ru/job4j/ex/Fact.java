package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        calc(-1);
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n could not be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}