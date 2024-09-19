package Sept.ex_13092024;
//calling an overloaded main() method from another main() method.
public class Lab018 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
main(10);
main("Poonam sawant");
    }
    public static void main(int num) {
        System.out.println(num);

    }
    public static void main (String name) {
        System.out.println(name);

    }
}
