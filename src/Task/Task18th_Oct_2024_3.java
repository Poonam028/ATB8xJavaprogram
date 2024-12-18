package Task;

public class Task18th_Oct_2024_3 {
    public static void main(String[] args) {
        String name = "madam";
        StringBuilder revName = new StringBuilder();
        for(int i = name.length()-1; i>=0;i--){
            char revName1 = name.charAt(i);
            revName.append(revName1);

            }
        System.out.println(revName);

        if (name.equals(revName.toString())){
            System.out.println(name + " is a palindrome");

        }else {
            System.out.println(name + " is not palindrome");
        }
    }
}
