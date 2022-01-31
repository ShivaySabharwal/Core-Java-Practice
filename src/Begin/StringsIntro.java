package Begin;

import java.util.Locale;

public class StringsIntro {
    public static void main(String[] args) {
//        String name = new String("Shivay");
//        System.out.println(name);
        String name = "Shivay";
        System.out.println(name);

        int val1 = name.length();
        System.out.println(val1);

        String val2 = name.toLowerCase();
        System.out.println(val2);

        String nonTrim = "       Shivay is a good boy     ";
        System.out.println(nonTrim);
        String trimString = nonTrim.trim();
        System.out.println(trimString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('a','u'));
        System.out.println(name.replace("ay","u"));
        System.out.println(name);

        System.out.println(name.startsWith("hi"));
        System.out.println(name.endsWith("ay"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ay"));

        String modifiedName = "SShhiivvaayy";
        System.out.println(modifiedName.indexOf("aay",4));

        System.out.println(modifiedName.lastIndexOf("asy"));

        System.out.println(modifiedName.equals(name));
        System.out.println(modifiedName.equals("shiv"));
        System.out.println(name.equals("Shivay"));
        System.out.println(name.equalsIgnoreCase("shivAy"));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \' single quote");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t tab");
        System.out.println("I am escape sequence \\ back slash");
    }
}
