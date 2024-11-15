package Oct.ex_11102024.SuperKeyword;

public class Car extends vehicle {
    public Car() {
        System.out.println(super.max);
        System.out.println(max);

    }

    public static void main(String[] args) {
        System.out.println("Child");
         int max = 12000;

    }


}

class vehicle{
    public int max = 11000;

    public void greenhouse(){
        System.out.println("PARENT");
    }
}
