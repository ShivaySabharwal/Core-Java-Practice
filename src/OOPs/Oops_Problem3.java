package OOPs;
import java.util.Random;
import java.util.Scanner;

/*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
*/
//GUESS THE NUMBER GAME
class game{
    private int rand = 0, guess = 0, no_of_guesses=0;
    public game(){ //USE OF CONSTRUCTOR
        Random rd = new Random ();
        rand = rd.nextInt(10);
    }

    public void userInput(int num){
        guess = num;
    }

    public boolean isCorrect(){
        if (rand > guess) {
            System.out.println ("have chosen a lesser number");
            no_of_guesses=no_of_guesses+1;
            return false;
        }
        else if (rand < guess) {
            System.out.println ("have chosen a bigger number");
            no_of_guesses=no_of_guesses+1;
            return false;
        }
        else {
            System.out.println ("correct guess");
            no_of_guesses=no_of_guesses+1;
            System.out.println("no. of guess required = "+no_of_guesses);
            return true;
        }
    }
}

public class Oops_Problem3{
    public static void main (String[]args){
        System.out.println ("(: !!! HI THERE !!! :)");
        Scanner sc = new Scanner(System.in);
        game gm = new game();
        System.out.println("guess a number:");
        gm.userInput(sc.nextInt());
        while(!gm.isCorrect()){
            System.out.println("guess a number:");
            gm.userInput(sc.nextInt());
        }
    }
}
