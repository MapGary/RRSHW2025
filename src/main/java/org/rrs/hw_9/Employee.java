package org.rrs.hw_9;

/*
Задача №2

Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
чтобы было удобно создавать эти объекты.
Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
зарплату за те месяцы которые были переданы в качестве аргумента.
*/

public class Employee {

    String employeeName;
    int age;
    String gender;
    double salaryPerDay;

    public double getSalary(Month[] monthArray) {

        double salary = 0;
        for(Month month : monthArray ) {
            salary += salaryPerDay * month.getWorkDays();
        }
        return salary;
    }

}
