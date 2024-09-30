package Sept.ex_25092024;

public class Lab061_Continue_Keyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("AFTER");
        }

    }
}
