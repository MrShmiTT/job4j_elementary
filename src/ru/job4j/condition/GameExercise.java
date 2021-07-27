package ru.job4j.condition;

public class GameExercise {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = (int) percent * prize - pay;
        if ((int) percent * prize > pay) {
            return rsl;
        }
        return 0;
    }
}