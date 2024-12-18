package Oct.ex_23102024;

public class Lab026_CustomeException {
    public static void main(String[] args) throws Exception {
        Lab025 SBI = new Lab025("INR", "100");
        Lab025 ICICI = new Lab025("INR", "100");
        Lab025 JP_Morgans = new Lab025("USD", "200");
        System.out.println(SBI.add(ICICI));
        System.out.println(SBI.add(JP_Morgans));
    }

}
