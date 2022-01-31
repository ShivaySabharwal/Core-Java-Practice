package Begin;

import java.util.Scanner;
import java.util.Random;

//Rock, Paper, and Scissors Game Code:-
public class Problem2 {
    public static void main(String[] args) {
        // 0 = Rock
        // 1 = Paper
        // 2 = Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1, for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int compInput = rand.nextInt(3);

        System.out.println("Computer's Input: " + compInput);

        if(userInput == compInput){
            System.out.println("!!! DRAW !!!");
        }
        else if(userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1){
            System.out.println("!!! (: YOU WIN :) !!!");
        }
        else{
            System.out.println("!!! (; COMPUTER WINS ;) !!!");
        }
    }
}
