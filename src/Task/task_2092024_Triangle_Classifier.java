package Task;

public class task_2092024_Triangle_Classifier {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        if (a == b && a == c) {
            System.out.println("the triangle is equilateral");
        } else if(a==b || b==c){
            System.out.println("isosceles");
        } else if (a!=b && a!=c){
            System.out.println("scalene");
        }
        }
    }

