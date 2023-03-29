package ru.job4j.array;
/*Заданы два числовых массива.
Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве. */

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] left = {1, 3};
        int[] right = {2, 1};
        printCrossEl(left, right);
    }
}