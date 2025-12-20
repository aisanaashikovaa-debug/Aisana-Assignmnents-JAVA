public class Student extends Human{
    private  String university;
    private float gpa;


    public Student(int age, String name, boolean active, String university, float gpa)
    {
        super(age, name, active);
        this.university = university;
        this.gpa= gpa;

    }

    public String getUniversity() {return university;}
    public void setUniversity(String university) {this.university = university;}

    public float getGpa(){return gpa;}
    public void setGpa(float gpa) {this.gpa = gpa;}

    public void introduce() {
        System.out.println("I'm a student, my name is " + getName());
    }
    @Override
    public String getRole() {return "Student";}
}



