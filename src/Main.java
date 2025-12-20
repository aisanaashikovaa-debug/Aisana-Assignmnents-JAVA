import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name=sc.nextLine();

        System.out.println("age:");
        int age=sc.nextInt();

        Human h =new Human(age, name, true);
        h.intoduce();
        System.out.println(h.getRole());

       Employee e =new Employee(40,"Arlan",  true, "Google", 3000f);
        e.intoduce();
        System.out.println(h.getRole());
        System.out.println("company:" + e.getCompany());

       Student s =new Student(18, "Aisana", true, "Aitu", 2.9f);
        s.intoduce();
        System.out.println(h.getRole());
        System.out.println("university:" + s.getUniversity());







    }

    }