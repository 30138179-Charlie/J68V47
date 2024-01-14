import java.io.*;
import java.util.*;
public class CalCalc {
    public static void addCalories() {
        Scanner input = new Scanner(System.in);

        // TRY TO WRITE A FLAT NUMBER OF CALORIES TO THE COUNTER
        try {
            FileWriter writer = new FileWriter("counter.txt", true);
            System.out.print("Enter your number of calories: ");
            int inputCalories = input.nextInt();
            System.out.println("Adding to your daily counter...");
            String flatCalories = "\n" + inputCalories;
            writer.write(flatCalories);
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception has been caught");
        }

    }
    public static String createMeal() {
        // CREATE A CUSTOM MEAL NAME AND RETURN IT
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the name of your meal: ");
            String mealName = input.nextLine();
            String completeMeal = "\n" + mealName;
            return completeMeal;
    }

    public static String mealCalories() {
        // DEFINE THE NUMBER OF CALORIES ASSOCIATED WITH THE CUSTOM MEAL AND RETURN IT
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of calories in your meal per 100g: ");
            int caloriesPer100g = input.nextInt();
            String completeCalories = "\n" + String.valueOf((caloriesPer100g / 100));
            return completeCalories;
        }

    public static void createDatabases(String meal, String calories) {
        Scanner input = new Scanner(System.in);
        // TRY TO WRITE THE CUSTOM MEAL NAME TO THE MEAL DATABASE
        try {
            FileWriter writer = new FileWriter("mealDatabase.txt", true);
            writer.write(meal);
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception has been caught");
        }
        // TRY TO WRITE THE NUMBER OF CALORIES ASSOCIATED WITH THE MEAL NAME TO THE MEAL CALORIE DATABASE
        try {
            FileWriter writer = new FileWriter("mealCalorieDatabase.txt", true);
            writer.write(calories);
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception has been caught");
        }
    }

    public static int mealChoice() {
        int index = 1;
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE SELECT YOUR ITEM:");

        // TRY TO PRINT ALL THE MEALS IN THE DATABASE AND THEIR PLACE WITHIN THE DATABASE FOR THE USER TO SEE
        try {
            Scanner scanner = new Scanner(new File("mealDatabase.txt"));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(index + "." + "" + line);
                index += 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // ASK THE USER FOR THEIR CHOSEN MEAL AND RETURN THE PLACE AS AN INTEGER
        System.out.print("Enter item index: ");
        int mealChoice = input.nextInt();
        return mealChoice;
    }

    public static void addMealChoice(int mealChoice) {

        // TRY TO READ FROM THE CALORIES DATABASE TO FIND THE CALORIES ASSOCIATED WITH THE USER'S CHOSEN MEAL
        try {
            Scanner scanner = new Scanner(new File("mealCalorieDatabase.txt"));
            Scanner input = new Scanner(System.in);

            // ITERATE THROUGH THE FILE UNTIL THE MEAL CHOICE REACHES 0 TO FIND THE ASSOCIATED CALORIES
            while (mealChoice > 0) {
                String line = scanner.nextLine();
                mealChoice -= 1;
                // TIMES THE ASSOCIATED CALORIES BY THE NUMBER OF GRAMS
                if (mealChoice == 0) {
                    System.out.print("\n" + "How many grams are you eating: ");
                    int grams = input.nextInt();
                    System.out.println("Adding to your daily counter…");
                    int caloriesToAdd = Integer.valueOf(line) * grams;

                    // TRY TO WRITE THE CALORIES TO THE COUNTER
                    try {
                        FileWriter writer = new FileWriter("counter.txt", true);
                        writer.write("\n" + caloriesToAdd);
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Exception has been caught");
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void displayCalories() {
        int calorieCounter = 0;
        // TRY TO ITERATE THROUGH THE COUNTER FILE AND ADD ALL ITEMS INTO A SINGLE VARIABLE TO DISPLAY THE CALORIES EATEN
        try {
            Scanner scanner = new Scanner(new File("counter.txt"));

            // ITERATING THROUGH THE FILE AND ADDING ITEMS TOGETHER
            while (scanner.hasNextLine()) {
                calorieCounter += scanner.nextInt();

            }
            //DISPLAY YOUR COUNTER
            System.out.println("Your daily counter: " + calorieCounter + "\n");
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void resetCounter() {
        System.out.println("Resetting counter...");
        // RESET THE FILE TO A BLANK STATE WITHOUT DELETING IT
        try{
            FileWriter writer = new FileWriter("counter.txt", false);
            PrintWriter pw = new PrintWriter(writer, false);
            pw.flush();
            pw.close();
            writer.close();
        } catch(Exception e){
            System.out.println("Exception has been caught");
        }
    }
    public static void main(String[] args) {
        String[] choices = {"1", "2", "3", "4", "5", "6"};
        Scanner input = new Scanner(System.in);


        // USER INTERFACES, PRESENTS USERS WITH A CHOICE AND CALLS THE FUNCTIONS NEEDED
        while (true){
            System.out.println("--WELCOME TO CALCALC, PLEASE CHOOSE AN OPTION.-- \n\n1. Add calories to your counter.\n2. Add a preset item to your counter.\n3. Create a new preset meal.\n4. Reset your daily counter.\n5. Display calorie counter.\n6. Exit program\n\n");
            System.out.print("Enter an option " + Arrays.toString(choices) +": ");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                addCalories();
            } else if (userChoice == 2) {
                addMealChoice(mealChoice());
            } else if (userChoice == 3) {
                createDatabases(createMeal(),mealCalories());
            } else if (userChoice == 4) {
                resetCounter();
            }else if (userChoice == 5) {
                displayCalories();
            }
            else if (userChoice == 6) {
                System.out.println("Have a good day!");
                break;
            }
            else {
                System.out.println("Command not recognised, please try again.");
            }
        }
    }
}
