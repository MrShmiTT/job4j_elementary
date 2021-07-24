package ru.job4j.calculator;

public class ArgMethod {
    public static void hello (String hi, String name) {
        System.out.println(hi + name);
    }

    public static void main(String[] args) {
        String hi = "Hello, ";
        String name = "Job4j";
        ArgMethod.hello(hi, name);
        ArgMethod.hello(hi, name);
        ArgMethod.hello(hi, name);
        ArgMethod.hello(hi, name);
    }
}
