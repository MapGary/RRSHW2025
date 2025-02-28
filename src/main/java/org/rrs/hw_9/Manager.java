package org.rrs.hw_9;

/*
Задача №3

Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
и количество подчиненных. Поля должны быть спрятаны, для каждого поля создать getter.
Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
В классе Employee создать метод convertToManager(int numberOfSubordinates).
Этот метод создаст и вернет объект типа Manager с теми же личными данными,
что были у Employee, и запишет переданное в него количество подчиненных.
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
            salary += monthArray[i].getWorkDays() * salaryManagerPerDay;
        }
        return salary + ((salary * 10 / 100) * employees);
    }
}
