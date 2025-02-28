package org.rrs.hw_9;

/*
Задача №3

Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
и количество подчиненных. Поля должны быть спрятаны, для каждого поля создать getter.
Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
*/

public class Manager {

    private final String managerName;
    private final int ageManager;
    private final String genderManager;
    private final double salaryManagerPerDay;
    private final int employees;

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getWorkDays() * salaryManagerPerDay;
        }
        return salary + ((salary * 10 / 100) * employees);
    }

    public Manager(String managerName, int ageManager, String genderManager, double salaryManagerPerDay, int employees) {
        this.managerName = managerName;
        this.ageManager = ageManager;
        this.genderManager = genderManager;
        this.salaryManagerPerDay = salaryManagerPerDay;
        this.employees = employees;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getAgeManager() {
        return ageManager;
    }

    public String getGenderManager() {
        return genderManager;
    }

    public double getSalaryManagerPerDay() {
        return salaryManagerPerDay;
    }

    public int getEmployees() {
        return employees;
    }
}
