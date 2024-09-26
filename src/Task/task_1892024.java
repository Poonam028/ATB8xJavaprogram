package Task;

public class task_1892024 {
    public static void main(String[] args) {
        //Give some another example of Widening with Implicit and Explicit,
        // Narrowing with implicit and explicit.

        //Implicit and explicit widening
        int A1 = 10;
        int B1 = 20;
        long C1 = A1+B1;
        long D1 = (A1+B1);
        System.out.println(C1);
        System.out.println(D1);


        //Implicit and explicit narrowing
        long  A = 500;
        float B = 50.55f;

        long s = A+(long)B;
        System.out.println(s);

    }
}
