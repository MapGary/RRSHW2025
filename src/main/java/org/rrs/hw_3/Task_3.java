package org.rrs.hw_3;

/*
Задача №3

Необходимо создать целочисленную переменную, присвоить
произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
 */
public class Task_3 {

    public static void main(String[] args) {

        int a = 120;

        if (a > 10) {
            System.out.println("больше 10");
        }
        if (a < 100) {
            System.out.println("меньше 100");
        }
        if (a * 1.0 / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
