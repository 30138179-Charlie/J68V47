import java.util.*;
public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: £");
        float purchase = input.nextFloat();
        float shipping = 10;

        if (purchase < 50) {
            System.out.println("your shipping amount is = £10.00");
            System.out.println("your final total = " + String.valueOf(purchase + shipping));
        }
        else{
            System.out.println("your final total = £" + String.valueOf(purchase));
        }

    }
}
