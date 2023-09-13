import java.util.*;
public class L3E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the Capital of Spain? ");
        String capital = input.nextLine();
        System.out.println(capital.toUpperCase().contains("MADRID"));
        System.out.print("Q2. What is the Capital of the UK? ");
        String capital2 = input.nextLine();
        System.out.println(capital2.toUpperCase().contains("LONDON"));
        System.out.print("Q3. What is the Capital of Italy? ");
        String capital3 = input.nextLine();
        System.out.println(capital3.toUpperCase().contains("ROME"));
    }
}
