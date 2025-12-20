public class Employee extends Human{
    private  String company;
    private float salary;

    public static String type = "EMPLOYEE";
    public Employee(int age, String name, boolean active, String company, float salary)
    {
    super(age, name, active);
    this.company = company;
    this.salary= salary;

    }

    public String getCompany() {return company;}
    public void setCompany(String company) {this.company = company;}

    public float getSalary(){return salary;}
    public void setSalary(float salary) {this.salary = salary;}

    public  void intoduce() {
        System.out.println("i'm a employee, my name is " + getName());
    }
    @Override
    public String getRole() {
        return "Employee";
    }
}
