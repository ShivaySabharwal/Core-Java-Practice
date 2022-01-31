package Begin;

import java.time.Year;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }


        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks in Physics = ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry = ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Mathematics = ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 +m3)/3.0f;
        System.out.println("Your overall percentage is = " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations you have been promoted!!!");
        }
        else{
            System.out.println("Sorry, Please Try again!!!");
        }

        //Problem 3:-
        float tax = 0.0f;
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs Per Annum");
        float income = sc.nextFloat();
        if(income<2.5f){
            tax = tax +0;
        }
        if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        if(income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);


        //Problem 4:-
        //Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value between 0 and 8: ");
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("You entered a wrong value!!!\nPlease Try Again:)");
        }


        //Problem 5:-
        //Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int YearVal = sc.nextInt();

        if(YearVal%400 == 0){
            System.out.println(YearVal + " is a leap Year");
        }
        else if(YearVal%100 == 0){
            System.out.println(YearVal + " is not a leap Year.");
        }
        else if(YearVal%4 == 0){
            System.out.println(YearVal + " is a leap Year.");
        }
        else{
            System.out.println(YearVal + " is not a leap Year.");
        }
    }
}
