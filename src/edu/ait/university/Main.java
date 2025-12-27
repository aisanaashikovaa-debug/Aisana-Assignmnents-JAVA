package edu.ait.university;

import edu.ait.university.interfaces.IStudy;
import edu.ait.university.interfaces.IWork;
import edu.ait.university.models.Employee;
import edu.ait.university.models.Human;
import edu.ait.university.models.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Aisana", 18, "AITU");

        Human employeeHuman = new Employee("Arlan", 30, 300000);

        IStudy employeeStudy = new Employee("Alina", 28, 250000);
        IWork employeeWork = new Employee("Alikhan", 35, 400000);

        student.introduce();
        student.study();
        student.passExam();
        student.showUniversity();

        System.out.println();

        employeeHuman.introduce();

        System.out.println();

        employeeStudy.study();
        employeeStudy.passExam();

        employeeWork.work();
        System.out.println("Salary: " + employeeWork.getSalary());
    }
}
