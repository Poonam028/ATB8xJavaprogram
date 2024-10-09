package Task;

public class task_2592024_factorial {
    public static void main(String[] args) {
        //By using for loop
        int factorial =1;
        for (int i=1; i<=5; i++){
            factorial = factorial *i;

        }
        System.out.println("Factorial of 5 is : " + factorial);

        //By using while loop
        int i =1;
        int factorial1 =1;
        while(i<=5){
            factorial1 = factorial1 *i;
            i++;
        }
        System.out.println(factorial1);
    }
}
