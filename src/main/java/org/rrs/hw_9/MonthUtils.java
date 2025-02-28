package org.rrs.hw_9;

/*
Задача 1 - продолжение
Создать класс MonthUtils который бы хранил подготовленные месяцы
или их массивы для использования (объекты класса Month).
*/

public class MonthUtils {
    public static final Month[] MONTHS = {
            new Month("Январь", 31, 20),
            new Month("Февраль", 28, 19),
            new Month("Март", 31, 22),
            new Month("Апрель", 30, 21),
            new Month("Май", 31, 20),
            new Month("Июнь", 30, 22),
            new Month("Июль", 31, 21),
            new Month("Август", 31, 23),
            new Month("Сентябрь", 30, 22),
            new Month("Октябрь", 31, 21),
            new Month("Ноябрь", 30, 20),
            new Month("Декабрь", 31, 23)
    };
}
