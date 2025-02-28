package org.rrs.hw_9;

/*
Задача №1
Создать неизменяемый (immutable) класс Month с полями: имя месяца,
количеством дней и количеством рабочих дней. Поля должны быть спрятаны,
для каждого поля создать getter.
*/

public final class Month {

    private final String monthName;
    private final int days;
    private final int workDays;

    public Month(String monthName, int days, int workDays) {
        this.monthName = monthName;
        this.days = days;
        this.workDays = workDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}
