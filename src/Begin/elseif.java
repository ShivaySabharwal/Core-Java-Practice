package Begin;
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        /*
        if (age>56){
            System.out.println("You are experienced.");
        }
        else if(age>46){
            System.out.println("You are semi experienced");
        }
        else if(age>46){
            System.out.println("You are semi-semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
        */

        switch(age){
            case 18:
                System.out.println("You are going to become an adult!!!");
                break;
            case 23:
                System.out.println("You are going to join a Job!!!");
                break;
            case 60:
                System.out.println("You are going to get retired!!!");
                break;
            default:
                System.out.println("!!!! Enjoy your life:) !!!!");
        }
        System.out.println("Thanks!!!");

        /*Enhanced Switch Statements:-
        switch (age) {
            case 18 -> System.out.println("You are going to become an adult!!!");
            case 23 -> System.out.println("You are going to join a Job!!!");
            case 60 -> System.out.println("You are going to get retired!!!");
            default -> System.out.println("!!!! Enjoy your life:) !!!!");
        }
        System.out.println("Thanks!!!");
        */
    }
}