package ru.job4j.array;
/* Задан числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
Сортировать массив не нужно! */

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
