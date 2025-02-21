package org.rrs.hw_7;

import java.util.Scanner;

//https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
//https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

public class Task_7_3_CodeWars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("You Can't Code Under Pressure #1");
        doubleInteger(num1);

        System.out.println();
        System.out.println("Opposites Attract");
        isLove(num1, num2);

        System.out.println();
        System.out.println("Convert a Number to a String!");
        numberToString(num1);

        System.out.println();
        System.out.println("Find the smallest integer in the array");
        int[] arr = {1, 4, 8, -1, 0, 5, -7, 9};
        findSmallestInt(arr);

        System.out.println();
        System.out.println("If you can't sleep, just count sheep!!");
        countingSheep(num1);

    }

    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String numberToString(int num) {
        return "" + num;
    }

    public static int findSmallestInt(int[] args) {

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            if (args[i] < max) {
                max = args[i];
            }
        }
        return max;
    }

    public static String countingSheep(int num) {
        String str = "";
        for (int i = 1; i <= num; i ++) {
            str += i + " sheep...";
        }
        return str;
    }
}
