package Begin;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!! Enter Marks out of 100 only !!!");

        System.out.print("Enter the 1st Subject Marks: ");
        float FirstMarks = sc.nextInt();
        System.out.print("Enter the 2nd Subject Marks: ");
        float SecondMarks = sc.nextInt();
        System.out.print("Enter the 3rd Subject Marks: ");
        float ThirdMarks = sc.nextInt();
        System.out.print("Enter the 4th Subject Marks: ");
        float FourthMarks = sc.nextInt();
        System.out.print("Enter the 5th Subject Marks: ");
        float FifthMarks = sc.nextInt();

        float TotalMarks = FirstMarks + SecondMarks + ThirdMarks + FourthMarks + FifthMarks;
        System.out.println("Total Marks obtained out of 500 are: " + TotalMarks);

        double PctMarks = (TotalMarks * 100) / (500);
        System.out.println("The Total Percentage obtained is: " + PctMarks);


        System.out.println("Enter a value: ");
        System.out.println("The value entered above is an integer: " + sc.hasNextInt());
    }
}
