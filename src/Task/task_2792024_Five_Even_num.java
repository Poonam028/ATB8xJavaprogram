package Task;

public class task_2792024_Five_Even_num {
    public static void main(String[] args) {
        int count = 0;
        for (int i =0; i<=50; i++){
            if(i % 2 == 0){
                System.out.println(i);
                count++;
            } if (count == 5){
                System.out.println("end");
                break;
            }

        }
    }
}


