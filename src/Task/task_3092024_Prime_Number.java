package Task;

public class task_3092024_Prime_Number {
    public static void main(String[] args) {
        for (int i =1; i <=100; i++){
            int count = 0;
            for (int num = i; num >=1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2){
                System.out.println("the prine number is " + i);
            }
        }
        }

}

        //5*4*3*2


