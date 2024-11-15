package Oct.ex_16092024;

public class Lab023CompoundOperator {
    public static void main(String[] args) {
        int a = 20;
        // a=+a +20 ==> This means that a = a+20 so the value for variable a is 40
        // we can write is as a+=a+20 also
        a=+a +20;
        System.out.println(a);
    }
}
