package ru.job4j.calculator;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double rsl = percent * prize - pay;
        if (percent * prize > pay) {
            return (int) rsl;
        }
        return 0;
    }
}