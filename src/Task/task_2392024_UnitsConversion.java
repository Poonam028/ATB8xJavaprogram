package Task;

public class task_2392024_UnitsConversion {
    public static void main(String[] args) {
        int a = 20;
        int choice  = 1;

        switch(choice){
            case 1-> System.out.println(a + " Kilometer is " + 06213*a + " miles ");
            case 2-> System.out.println(a  + " celcious is " + (a * 9 / 5) + 32+" F");
            default -> System.out.println("invalid input");
        }
    }
}