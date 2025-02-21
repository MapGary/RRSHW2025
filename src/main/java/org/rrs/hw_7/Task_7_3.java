package org.rrs.hw_7;

public class Task_7_3 {

    public static void main(String[] args) {

//Задача №1
//
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

        System.out.print("Задача №1");
        System.out.println();

        double a = 36.7;
        double b = 12.1;
        
        sum(a, b);
        subtract(a, b);
        mult(a, b);
        divid(a, b);
    }

    public static void sum(double a, double b) {
        System.out.print("сложение: " + (a + b));
        System.out.println();
    }
    
    public static void subtract(double a, double b) {
        System.out.print("вычитание: " + (a - b));
        System.out.println();
    }
    
    public static void mult(double a, double b) {
        System.out.print("умножение: " + (a * b));
        System.out.println();
    }
    public static void divid(double a, double b) {
        System.out.print("деление: " + (a / b));
        System.out.println();
    }
}
