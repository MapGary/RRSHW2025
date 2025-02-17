package org.rrs.hw_6;
/*Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
*/

public class Task_1 {

    public static void main(String[] args) {

        String s = "Перестановочный алгоритм быстрого действия";

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'о') {
                System.out.print(charArray[i]);
            }
        }

    }
}
