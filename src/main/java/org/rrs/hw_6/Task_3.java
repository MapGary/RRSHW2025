package org.rrs.hw_6;

//Задача №3
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

public class Task_3 {

    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";
        String sLower = s.toLowerCase();
        String subStr = "рит";

        for (int i = 0; i < s.length(); i++) {
            if (sLower.startsWith(subStr, i)) {
                System.out.println(i);
            }
        }
    }
}
