package ru.job4j.condition;

public class Tour {
    public static void offer(boolean passport) {
        System.out.println("A client has foreign passport: " + passport);
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true); /* можно сократить до offer(true), т.к. всего один класс*/
        Tour.offer(false);
    }
}
