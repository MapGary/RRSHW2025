package org.rrs.hw_7;

public class Task_7_1 {

    public static void main(String[] args) {

//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        System.out.println("Задача №1");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("сумма всех значений массива: " + sumArray(array));


//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        System.out.println();
        System.out.println("Задача №2");
        System.out.println("максимальное значение массива: " + maxArray(array));

//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
        System.out.println();
        System.out.println("Задача №3");
        System.out.println("минимальное значение массива: " + minArray(array));

//        Задача №4
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        System.out.println();
        System.out.println("Задача №4");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("среднее арифметическое всех значений массива: " + avgArray(array2));


//        Задача №5
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        System.out.println();
        System.out.println("Задача №5");
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println("сумма элементов массива: " + sumDoubleArr(array3));


//        Задача №6
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

        System.out.println();
        System.out.println("Задача №6");
        System.out.println("максимальное значение массива: " + maxDoubleArray(array3));


    }

    public static int sumArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxArray(int[] arr) {

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minArray(int[] arr) {

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double avgArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum * 1.0) / arr.length;
    }

    public static int sumDoubleArr(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int maxDoubleArray(int[][] arr) {

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
