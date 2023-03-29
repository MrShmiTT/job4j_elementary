package ru.job4j.loop;
/* Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения сокращаем,
забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
Необходимо из полученной строки сформировать аббревиатуру.
Для формирования новой строки используйте StringBuilder и его метод append(). */

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            if (Character.isUpperCase(a)) {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}

/* 2й вариант
public class Abbreviation {
    public static String collect(String s) {
        String[] arrs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrs.length; i++) {
            sb.append(arrs[i].charAt(0));
        }
        return sb.toString();
    }
}*/

/* 3й вариант
public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : s.split (" ")) {
            sb.append(word.substring(0, 1));
        }
        return sb.toString();
    }
}*/