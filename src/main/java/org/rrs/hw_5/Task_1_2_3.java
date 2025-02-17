package org.rrs.hw_5;

/*
Задача №1

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все нечетные числа из массива.


Задача №2

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все значения массива больше 5.


Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо увеличить все значения массива на 15.

 */

import java.util.Arrays;

public class Task_1_2_3 {

    public static void main(String[] args) {

        System.out.println("1 task");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println();
        System.out.println("2 task");

        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i =0; i < arr.length; i++) {
            if(arr[i] > 5) {
                System.out.println(arr[i]);
            }
        }

        System.out.println();
        System.out.println("3 task");

        int[] a = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i = 0; i < a.length; i++) {
            a[i] += 15;
        }
        System.out.println(Arrays.toString(a));
    }
}
