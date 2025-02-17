package org.rrs.hw_4;
/*
Задача №1

Необходимо вывести числа от 0 до 15.

Задача №2

Необходимо вывести все положительные степени числа 5 до тех пор,
пока результат возведения в степень меньше 100000, вывести результат возведения в степень.

Задача №3

Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).
*/

public class Task_1_2_3 {

    public static void main(String[] args) {

        System.out.println("1 task");
        for(int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("2 task");
        double a = 5;
        int deg = 1;
        while(a < 100) {
            System.out.println(deg);
            deg++;
            a = Math.pow(5, deg);
        }

        System.out.println();
        System.out.println("3 task");
        System.out.println("1 method");
        for (int i = 40; i <= 60; i+=4){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("2 method");
        for(int i = 40; i <= 60; i++){
            if(i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
