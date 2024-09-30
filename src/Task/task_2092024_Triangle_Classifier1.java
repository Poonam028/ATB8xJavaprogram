package Task;

import java.util.Scanner;

public class task_2092024_Triangle_Classifier1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of side 1:");
        int a = sc.nextInt();
        System.out.println("Length of side 2:");
        int b = sc.nextInt();
        System.out.println("Length of side 3:");
        int c = sc.nextInt();
        if (a >= 1 && b >= 1 && c >= 1) {
            if (a == b && a == c) {
                System.out.println("the triangle is equilateral");
            } else if (a == b || b == c) {
                System.out.println("isosceles");
            } else if (a != b && a != c) {
                System.out.println("scalene");
            } else {
                System.out.println("Not possible");

            }
        }
    }
}