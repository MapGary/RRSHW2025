package org.rrs.hw_3;

/*
Задача №2

Необходимо создать две целочисленные переменные (a, b),
присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
 */

public class Task_2 {

    public static void main(String[] args) {

        int a = 234;
        int b = 687;

        System.out.println(ifElse(a, b));
    }

    public static String ifElse(int a, int b){
        if ((a + b) % 2 == 0) {
            return "maybe a and b are even";
        } else {
            return "some variable is odd";
        }
    }
}
