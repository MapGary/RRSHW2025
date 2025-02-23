package org.rrs.hw_8;

/*
Задача №3

Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
и количество подчиненных. Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
*/

public class Manager {

    String managerName;
    int ageManager;
    String genderManager;
    double salaryManagerPerDay;
    int employees;

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].workDays * salaryManagerPerDay;
        }
        return salary + ((salary * 10 / 100) * employees);
    }
}
