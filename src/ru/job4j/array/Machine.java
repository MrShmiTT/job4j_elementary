package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];                                       // массив, содержащий монеты, которыми дали сдачу
        int size = 0;                                                   // количество монет, т.е. размер массива rsl
        int sdacha = money - price;                                     // размер нашей сдачи за кофе
        for (int i = 0; i < coins.length; i++) {                        // начинаем перебор ячеек с монетами
            while (sdacha - coins[i] >= 0) {                            // наичнаем перебор сдачи которую нам еще должен выдать автомат
                sdacha = sdacha - coins[i];                             // счиатем размер оставшейся сдачи
                rsl[size] = coins[i];                                   // количество монет равно количеству раз, сколько выпали монеты
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}