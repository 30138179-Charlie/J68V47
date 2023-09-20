import java.util.*;
public class L4E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the Capital of Spain? ");
        String capital = input.nextLine();
        if (capital.equalsIgnoreCase("MADRID")) {
            System.out.println("Correct!");
        }
        else if (capital.toUpperCase() != "MADRID") {
            System.out.println("Incorrect!");
        }

        System.out.print("Q2. What is the Capital of the UK? ");
        String capital2 = input.nextLine();
        if (capital2.equalsIgnoreCase("LONDON")) {
            System.out.println("Correct!");
        }
        else if (capital2.toUpperCase() != "LONDON") {
            System.out.println("Incorrect!");
        }

        System.out.print("Q3. What is the Capital of Italy? ");
        String capital3 = input.nextLine();
        if (capital3.equalsIgnoreCase("ROME")) {
            System.out.println("Correct!");
        }
        else if (capital3.toUpperCase() != "ROME") {
            System.out.println("Incorrect!");
        }
    }
}