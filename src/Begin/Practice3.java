package Begin;

public class Practice3 {
    public static void main(String[] args) {
        String name = "Shivay Sabharwal";
        name = name.toLowerCase();
        System.out.println(name);

        String name1 = "Hello There";
        name1 = name1.replace(" ", "_");
        System.out.println(name1);

        String letter = "Dear <|name|>, Thanks a Lot!!!";
        letter = letter.replace("<|name|>","Shivay");
        System.out.println(letter);

        String myString = "This string contains  double and  triple spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        String myLetter = "Dear Shivay,\n This is a letter.\nThanks!";
        System.out.println(myLetter);
    }
}
