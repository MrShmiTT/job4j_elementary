package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        int[][] array = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (array[i][j] == 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}