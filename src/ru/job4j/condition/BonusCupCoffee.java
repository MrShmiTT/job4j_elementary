package ru.job4j.condition;

/* Мы часто встречаем интересные маркетинговые ходы в кафе. Самый популярный из них -
 возьми определенное количество чашек кофе, отметь это на специальном бланке и следующую чашку ты получишь бесплатно.

Метод принимает 2 параметра:
1. Количество чашек кофе, за которые посетитель заплатил;
2. Количество чашек кофе, по достижении которого следующая чашка будет бесплатной.
Необходимо реализовать метод таким образом, чтобы он вернул общее количество чашек кофе - оплаченных и бонусных. */

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl = count / n;
        return rsl + count;
    }
}