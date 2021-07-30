package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = 0;
        while (n >= d) {
            rsl = n - d;
            n -= d;
        }
        return rsl;
    }
}
