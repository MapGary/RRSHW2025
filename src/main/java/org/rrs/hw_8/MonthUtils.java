package org.rrs.hw_8;

/*
Задача 1 - продолжение
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для
использования {объекты класса Month}.
*/

public class MonthUtils {
    public static final Month[] MONTHS = {
            createMonth("Январь", 31, 20),
            createMonth("Февраль", 28, 19),
            createMonth("Март", 31, 22),
            createMonth("Апрель", 30, 21),
            createMonth("Май", 31, 20),
            createMonth("Июнь", 30, 22),
            createMonth("Июль", 31, 21),
            createMonth("Август", 31, 23),
            createMonth("Сентябрь", 30, 22),
            createMonth("Октябрь", 31, 21),
            createMonth("Ноябрь", 30, 20),
            createMonth("Декабрь", 31, 23)
    };

    // Вспомогательный метод для создания месяца
    private static Month createMonth(String name, int days, int workDays) {
        Month month = new Month();
        month.monthName = name;
        month.days = days;
        month.workDays = workDays;
        return month;
    }
}
