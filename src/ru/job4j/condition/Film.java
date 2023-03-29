package ru.job4j.condition;

public class Film {
    public static String permission(int age) {
/*        String label = "";                         через ветвление
        if (age >= 18) {
            label = "Please, enjoy it.";
        } else {
            label = "You can't watch it.";
        }

        String label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";        через тернарный оператор*/

        boolean can = age >= 18;                                            /* через boolean и тернарный*/
        String label = can ? "Please, enjoy it." : "You can't watch it.";   /* можно String заменить на return*/

        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permission(17);
        System.out.println(msg);
    }
}