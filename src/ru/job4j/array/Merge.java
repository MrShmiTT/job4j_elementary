package ru.job4j.array;
/*  Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив? */

public class Merge {
    public static int[] merge(int[] left, int[] right) {            // массивы, которые нужно слить
        int[] rsl = new int[left.length + right.length];            // результирующий массив и вычисление его длины
        int i = 0;                                                  //  индексы для массивов left и right
        int j = 0;                                                  // которые указывают на текущие элементы на каждом шаге и образуют буфер для перемещения.
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {                              // проверяет, что бы индексы не вышли за переделы количества элементов в массивах.
                int temp = right[j];
                rsl[k] = temp;
                j++;
            } else if (j > right.length - 1) {                      // проверяет, что бы индексы не вышли за переделы количества элементов в массивах.
                int temp = left[i];
                rsl[k] = temp;
                i++;
            } else if (left[i] < right[j]) {                        // обеспечивает перемещение в массив наименьшего элемента из первого массива
                int temp = left[i];
                rsl[k] = temp;
                i++;
            } else {
                int temp = right[j];                                // обеспечивает перемещение в массив наименьшего элемента из второго массива
                rsl[k] = temp;
                j++;
            }
        }
        return rsl;
    }
}