package Task;

public class task_04102024_Person {
    // Instance variables
    public task_04102024_Person() {
        System.out.println("Default constructor");
    }

    public task_04102024_Person(String name, String city, int age, double height) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.height = height;
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.age);

    }

    String name = "poonam";
    String city = "mumbai";
    int age = 22;
    long mobileNumber = 998877665;
    double height = 55.9;
    boolean isFair = true;
    char bloodGroup = 'B';
    char classDivision = 'A';
    String address = "Some Address";
    double weight = 47.9;

    // Instance methods
    int eat() {
        System.out.println("Eating bread");
        return 10;
    }

    void study(String name) {
        System.out.println("Studying");
    }

    String dance(String Address) {
        System.out.println("Dancing");
        return Address;
    }

    void walk() {
        System.out.println("Walking");
    }

    void talk() {
        System.out.println("Talking");
    }
}
