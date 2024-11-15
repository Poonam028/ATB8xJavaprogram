package Task;

public class task_3092024_Vowels {
    public static void main(String[] args) {
        String name = "pramod";
        int vowels = 0;
        int consonant = 0;
        for (int i = 1; i < name.length(); i++) {
            char A = name.charAt(i);
            if (A =='a' || A == 'e' || A == 'i' || A == 'o' || A == 'u'){
                vowels++;
            } else {
                consonant++;
            }

        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}