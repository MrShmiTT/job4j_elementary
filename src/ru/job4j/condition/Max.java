package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;         /* можно заменить на return Math.max(left, right);*/
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println(rsl);
    }
}
