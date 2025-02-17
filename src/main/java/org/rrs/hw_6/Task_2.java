package org.rrs.hw_6;

//Задача №2
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.

public class Task_2 {

    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";
        int count = 0;

        char [] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
}
