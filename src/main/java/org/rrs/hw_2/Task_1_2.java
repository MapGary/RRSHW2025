package org.rrs.hw_2;

/*Задача №1

Необходимо создать целочисленные переменные a и b,
присвоить произвольные значения переменным на ваш выбор и вывести
результаты следующих операций с этими переменными:
сложение, умножение, вычитание, деление и остаток от деления.
Также сделать проверку на четность этих переменных и вывести результат.

Задача №2

Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
а потом поменять значения местами (значение переменной a должно оказаться в
переменной b и наоборот).

*/

public class Task_1_2 {

    public static void main(String[] args) {
        int a = 34;
        int b = 6;

        System.out.println("1 task");
        System.out.println("addition" + (a + b));
        System.out.println("subtraction" + (a - b));
        System.out.println("multiplying" + (a * b));
        System.out.println("dividing" + (a * 1.0 / b));
        System.out.println("remainder of division" + (a % b));
        System.out.println();

        System.out.println(parity(a));
        System.out.println(parity(b));
        System.out.println();

        System.out.println("2 task");

        int c = 67;
        int d = 487;
        int e;

        e = c;
        c = d;
        d = e;

        System.out.println("c = " + c + ", d = " + d);

    }
    public static String parity(int a) {
        if (a % 2 == 0) {
            return a + " is an even number";
        } else {
            return a + "is an odd number";
        }
    }
}
