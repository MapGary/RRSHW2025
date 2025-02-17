package org.rrs.hw_3;

/*
Задача №1

Необходимо создать две целочисленные переменные (a, b),
присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a

*/
public class Task_1 {

    public static void main(String[] args) {

        int a = 345;
        int b = 456;

        System.out.println(ifElse(a, b));
    }

    public static String ifElse(int a, int b) {
        if(a == b) {
            return "a == b";
        } else if(a < b) {
            return "a < b";
        } else {
            return "a > b";
        }
    }

}
