package ru.job4j.loop;

public class CheckPrimeNumberTest {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                break;
            }
        }
        return prime;
    }
}