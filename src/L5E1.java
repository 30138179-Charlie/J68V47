import java.util.*;
public class L5E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int subjectNumber = input.nextInt();

        for (int count = 1; count <13; count+=1) {
            System.out.println(String.valueOf(subjectNumber) + " x " + String.valueOf(count) + " = "  + String.valueOf(subjectNumber * count));
        }
    }
}
