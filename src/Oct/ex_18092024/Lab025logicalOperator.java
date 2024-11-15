package Oct.ex_18092024;

public class Lab025logicalOperator {
    public static void main(String[] args) {
       // !, &&,
        boolean a = true;
        boolean b = true;
        boolean e = false;
        boolean f = false;

        boolean c = a&&b;
        System.out.println(c);

        boolean d = a||e;
        System.out.println(d);

        boolean m = e||f;
        System.out.println(d);

        boolean n = !!!(false||false);
        System.out.println(n);

    }
}
