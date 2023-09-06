import java.util.*;
public class L2E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter item 1: ");
        String item1 = input.nextLine();
        System.out.print("Please enter the price: ");
        Float item1Price = input.nextFloat();
        input.nextLine();

        System.out.print("Please enter item 2: ");
        String item2 = input.nextLine();
        System.out.print("Please enter the price: ");
        Float item2Price = input.nextFloat();
        input.nextLine();

        System.out.print("Please enter item 3: ");
        String item3 = input.nextLine();
        System.out.print("Please enter the price: ");
        Float item3Price = input.nextFloat();
        input.nextLine();

        System.out.format("%s..... . %s\n", item1, item1Price);
        System.out.format("%s..... . %s\n", item2, item2Price);
        System.out.format("%s..... . %s\n", item3, item3Price);
    }
}
