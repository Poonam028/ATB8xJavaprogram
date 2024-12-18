package Oct.ex_21102024;

import java.io.FileInputStream;

public class Lab021 {
    public static void main(String[] args) {
                String name = null;
                int a = 0;

                try {
                    int b = 10 / a; // ArithmeticException
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException caught: " + e.getMessage());
                }
                try {
                    name = name.trim(); // NullPointerException
                }
                catch (Exception e) {
                    System.out.println("General exception caught: " + e.getMessage());
                }

                System.out.println("End of program");
            }

}
