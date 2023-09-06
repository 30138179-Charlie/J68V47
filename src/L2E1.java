import java.util.*;
public class L2E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What hobbies are you particularly interested in?");
        String hobby = input.nextLine();
        System.out.println("Your name is " + name + "\nYou like " + hobby + "\n" + hobby + " is a way of structuring yourself and introduces a form of discipline to your life. " + hobby + " also helps you to relax.");

    }
}
