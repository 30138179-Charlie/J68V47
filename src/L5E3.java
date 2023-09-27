import java.util.*;
public class L5E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 5;
        int number2 = 2;
        int score = 0;
        int answer =  number1 + number2;

        for (int count=1; count<11; count++) {
            System.out.format("What is %s + %s? ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == answer) {
                System.out.println("Correct!");
                number1+=2;
                number2+=1;
                score ++;
                answer =  number1 + number2;
            }
            else {
                System.out.println("Wrong, try again...");
            }
        }
        System.out.println("Your score: " + String.valueOf(score) + "/10");
    }
}
