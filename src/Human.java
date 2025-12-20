public class Human {

    private int age;
    private String name;
    private boolean active;

    public Human() {}

    public Human(int age, String name, boolean active){
        this.age = age;
        this.name = name;
        this.active = active;
    }

    public int getAge(){return age;}
    public void setAge(int age) {this.age = age;}

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public boolean getActive(){return active;}
    public void setActive(boolean active) {this.active = active;}

    public void intoduce() {
        System.out.println("i'm a human, my name is " + name);
    }

    public String getRole() { return "Human";}
}

