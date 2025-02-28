package org.rrs.hw_9;

/*



Задача №2

Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
чтобы было удобно создавать эти объекты.
Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
зарплату за те месяцы которые были переданы в качестве аргумента.


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

public class Employee {

    String employeeName;
    int age;
    String gender;
    double salaryPerDay;

    public double getSalary(Month[] monthArray) {

        double salary = 0;
        for(Month month : monthArray ) {
            salary += salaryPerDay * month.workDays;
        }
        return salary;
    }

}
