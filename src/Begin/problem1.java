package Begin;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("!!! Enter Marks out of 100 OR 80 only !!!");
        float marks = 0.0f;

        System.out.print("Enter the Maximum Marks that can be obtained in a Subject: ");
        int MaxMarks = sc.nextInt();

        System.out.print("Enter the 1st Subject Marks: ");
        marks += sc.nextFloat();
        System.out.print("Enter the 2nd Subject Marks: ");
        marks += sc.nextFloat();
        System.out.print("Enter the 3rd Subject Marks: ");
        marks += sc.nextFloat();
        System.out.print("Enter the 4th Subject Marks: ");
        marks += sc.nextFloat();
        System.out.print("Enter the 5th Subject Marks: ");
        marks += sc.nextFloat();

        System.out.println("Total Marks obtained are: " + marks);

        double PercentMarks = (marks * 100) / (MaxMarks * 5);
        System.out.println("The Total Percentage obtained is: " + PercentMarks);
    }
}
