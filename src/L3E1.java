import java.util.*;
public class L3E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your surname: ");
        String surname = input.nextLine();
        System.out.print("Enter your Year of Birth: ");
        String yob = input.nextLine();

        System.out.println("Username: " + name.substring(0,1).toUpperCase() + surname.toLowerCase());
        System.out.println("Password: " + surname.substring(0,1).toLowerCase() + name.substring(0,3).toUpperCase() + yob);

    }
}
