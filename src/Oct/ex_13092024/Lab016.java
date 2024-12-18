package Oct.ex_13092024;

public class Lab016 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog");
        Animal a2 = new Animal("Dog");

        System.out.println(a1 == a2);        // false, different references
        System.out.println(a1.equals(a2));  // false, same as ==
    }
}
        class Animal {
            String name;

            Animal(String name) {
                this.name = name;
            }
        }
        
