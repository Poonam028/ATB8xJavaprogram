package Oct.ex_18092024;

public class Lab035Grade_calculator {
    public static void main(String[] args) {

        int a = 95;
        char grade = 0;
        if(a >=90 && a<=100){
            grade = 'A';
        }else if (a<90 && a>=80){
            grade = 'B';
        } else if(a<80 && a>=70){
            grade = 'C';
        } else if(a<70 && a>=60) {
            grade = 'D';
        } else if(a<60 && a>=50){
            grade = 'F';
    }

        System.out.println(grade);


    }
}
