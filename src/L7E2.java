import java.util.*;
public class L7E2 {
    public static void calculateSum(int x, int y){
        System.out.println("The value of " + String.valueOf(x) + " + " + String.valueOf(y) + " is " + (x+y));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = input.nextInt();
        calculateSum(num1, num2);
    }
}
