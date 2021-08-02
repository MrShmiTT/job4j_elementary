package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            int workHours = hours[i];
            if (i <= 4 && workHours != 0) {
                if (workHours <= 8) {
                    salary += workHours * 10;
                } else {
                    salary += 8 * 10 + (workHours - 8) * 15;
                }
            } else if ((i == 5 || i == 6) && workHours != 0) {
                if (workHours <= 8) {
                    salary += workHours * 20;
                } else {
                    salary += 8 * 20 + (workHours - 8) * 30;
                }
            }
        }
        return salary;
    }
}

// 2 вариант
//        int sum = 0;
//        for (int i = 0; i < hours.length; i++) {
//            int workHours = hours[i];
//            if ((i % 5 == 0 || i % 6 == 0) && workHours != 0 && i != 0) {
//                if (workHours <= 8) {
//                    sum += 20 * workHours;
//                } else {
//                    sum += 8 * 20 + (workHours - 8) * 30;
//                }
//            } else if (workHours != 0) {
//                if (workHours <= 8) {
//                    sum += 10 * workHours;
//                } else {
//                    sum += 8 * 10 + (workHours - 8) * 15;
//                }
//            }
//        }
//        return sum;
//    }
//}