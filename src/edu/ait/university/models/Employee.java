package edu.ait.university.models;

import edu.ait.university.interfaces.IStudy;
import edu.ait.university.interfaces.IWork;

public class Employee extends edu.ait.university.models.Human implements IWork, IStudy {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying while working");
    }

    @Override
    public void passExam() {
        System.out.println(name + " passed exams as employee");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am employee " + name);
    }
}
