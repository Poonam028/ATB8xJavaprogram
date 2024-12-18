package Oct.ex_23102024;

public class Lab023 {
    public static void main(String[] args) {
        int a = 0;
        int c =10;
        try {
            int b = 10 / a;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            int d = 10/c;
            System.out.println(d);
        }

    }
}
