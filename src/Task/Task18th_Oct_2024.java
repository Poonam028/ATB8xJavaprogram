package Task;

public class Task18th_Oct_2024 {
    public static void main(String[] args) {
        String name = "Pramod";
        StringBuilder lengthName = new StringBuilder();
        for (int i =name.length()-1; i>=0; i--){
            char name1 = name.charAt(i);
            lengthName.append(name1);
        }
        System.out.println(lengthName);


    }
}
