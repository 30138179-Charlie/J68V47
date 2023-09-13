import java.util.*;
public class L3E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        float l = input.nextFloat();
        System.out.print("Interest Rate (APR %): ");
        float j = input.nextFloat() / 100 / 12;
        System.out.print("Number of years: ");
        float n = input.nextFloat() * 12;
        double m = l * (j / (1- Math.pow((1 + j), -n)));
        System.out.print(m);



    }
}
