package Oct.ex_11102024;


public class Lab002 {
    public static void main(String[] args) {
        VWOlogin vwologin = new VWOlogin( "admin", "password123");
        System.out.println(vwologin.password);
        vwologin.password = "poonam";
        System.out.println(vwologin.password);

        GoodVWOlogin vwologin1 = new GoodVWOlogin("admin", "poonam123");

        System.out.println(vwologin1.getUsername());
        System.out.println(vwologin1.getPassword());
        vwologin1.setUsername("Poonam");
        //vwologin1.setPassword("Admin");
        System.out.println(vwologin1.getPassword());
        System.out.println(vwologin1.getUsername());

    }
}
