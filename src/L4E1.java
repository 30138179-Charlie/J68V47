import java.util.*;
public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter your Surname: ");
        String surname = input.nextLine();
        System.out.print("Enter the total value of your order: £");
        float orderValue = input.nextFloat();
        System.out.print("Enter the amount you wish to pay as a deposit: £");
        float deposit = input.nextFloat();
        String remainder = String.valueOf(orderValue - deposit);

        System.out.println("==Receipt==");
        System.out.println("Customer: " + firstname.substring(0,1).toUpperCase() + " " + surname.substring(0,1).toUpperCase() +surname.substring(1));
        System.out.println("Order Total: £" + orderValue);
        System.out.println("Deposit Paid: £" + deposit);
        System.out.println("Remainder: £" + remainder);
        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");

    }
}
