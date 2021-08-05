package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {                    // узнаем длинну массива стро
            if (array[index] == null) {                                         // если значение индекса равно 0, то
                for (int i = index + 1; i < array.length; i++) {                // то, узнаем длину массива оставшихся строк
                    if (array[i] != null) {                                     // если значение индекса нового массива не раавно null, то
                        SwitchArray.swap(array, index, i);                      // то, меняем значение местами
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + " ");
        }
    }
}
