class Human {
    private int age;
    private String name;

    // Default Constructor
    public Human() {
        age = 20;
        name = "Prashant";
        System.out.println("in constructor");
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("in constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        // calling Default  Constructor
        Human obj = new Human();
        System.out.println(obj.getName() + " " + obj.getAge());

        // calling Parameterized Constructor
        Human obj1 = new Human(30, "Ram");
        System.out.println(obj1.getName() + " " + obj1.getAge());
    }

}
