import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class CalCalc {
    public static void addCalories() {
        Scanner input = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("counter.txt");
            System.out.print("Enter your number of calories: ");
            String flatCalories = input.nextLine();
            writer.write(flatCalories);
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception have been caught");
        }

    }
    public static void createMeal() {

    }
    public static void addMeal() {

    }
    public static void resetCounter() {
        System.out.println("Resetting counter...");
        try{
            FileWriter writer = new FileWriter("counter.txt", false);
            PrintWriter pw = new PrintWriter(writer, false);
            pw.flush();
            pw.close();
            writer.close();
        } catch(Exception exception){
            System.out.println("Exception have been caught");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        while (true){
            System.out.println("--WELCOME TO CALCALC, PLEASE CHOOSE AN OPTION.-- \n\n1. Add calories to your counter.\n2. Add a preset item to your counter.\n3. Create a new preset meal.\n4. Reset your daily counter.\n5. Exit program\n\n");
            System.out.print("Enter an option: ");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                addCalories();
            } else if (userChoice == 2) {
                System.out.println("choice 2");
            } else if (userChoice == 3) {
                System.out.println("choice 3");
            } else if (userChoice == 4) {
                resetCounter();
            }else if (userChoice == 5) {
                System.out.println("Have a good day!");
                break;
            }
            else {
                System.out.println("Command not recognised, please try again.");
            }
        }
    }
}
