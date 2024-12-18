package Oct.ex_21102024;

public class Lab020 {
    public static void main(String[] args) {
        int a = 3;
        String b = "Poonam";
        String c = "3";
        // int d = c; == This is not possible. Because the changing a non primitive data type
        // to primitive data type is ot possible.
        //To perform this we need to use a wrapper class

        Integer num = Integer.valueOf(c);
        System.out.println(num);
        int num2 = num;
        System.out.println(num2);
        // in collection framework only objects and classes are needed.
        // that is the major reason of using wrapper class.

        System.out.println("start the program");
        String ip = args[0];
        String ip1 = args[1];
        String ip2 = args[2];
        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);



    }
}
