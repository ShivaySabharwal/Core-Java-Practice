package Begin;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Again, Enter a number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The Sum of these numbers is: ");
        System.out.println(sum);

        System.out.print("Enter a value to check: ");
        boolean b1 = sc.hasNextInt();
        System.out.print("The value entered above is an integer: " + b1);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
