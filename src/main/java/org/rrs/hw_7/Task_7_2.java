package org.rrs.hw_7;

/*Вывести следующие строки с соответствующим форматированием (как пирамиды):

Задача №1

0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0


Задача №2

0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0

Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0
*/

public class Task_7_2 {

    public static void main(String[] args) {

        System.out.println("Задача 1");

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        System.out.println("Задача 2");

        String space = "";

        for (int i = 0; i < 10; i++) {
            System.out.print(space);
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            space += "  ";

        }

        System.out.println();
        System.out.println("Задача 3");

        String space2 = "";

        for (int i = 0; i < 10; i++) {
            System.out.print(space2);
            for (int j = 10 - i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k < 10 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            space2 += "  ";
        }
    }
}
