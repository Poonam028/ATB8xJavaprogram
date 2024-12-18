package Oct.ex_21102024;

public class Lab022 {
    public static void main(String[] args) {
                String name = null;
                int a = 0;

                try {
                    int b = 10 / a;
                    name = name.trim();
                    System.out.println(name);
                    System.out.println(b);
                } catch (ArithmeticException  | NullPointerException e) {
                    System.out.println( e.getMessage());
                }

                System.out.println("End of program");
            }

}
// This program will catch only one exception that is
// / by zero
//End of program