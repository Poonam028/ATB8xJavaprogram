package Task;

public class task_2092024_Ternary_operator_garde {
    public static void main(String[] args) {
        // Input → int score = 85
        // String grade →
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C

        int a = 85;
                String grade = (a >= 90) ? "A" :
                        (a >= 80) ? "B" :
                                (a >= 70) ? "C" : "F"; // F for failing grade

                System.out.println("Score: " + a + " → Grade: " + grade);
            }

            
        }



