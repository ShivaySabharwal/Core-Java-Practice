package Folder.FolderL1.FolderL2;

/**
 * This class is to demonstrate what Scientific Calculator is.
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: " + (a+b));
    }
}

class ScCalculator{
    public void sccalculate(int a, int b){
        System.out.println("Your result is: " + (Math.sin(a + b)));
    }
}

class HyCalculator{
    public void hycalculate(int a, int b){
        System.out.println("Your results are: " + (a+b) + " and " + (Math.sin(a+b)));
    }
}

public class Oops19_Packages1 {
    protected int pro1 = 3;
    int pro2 = 32;
    public static void main(String[] args) {
        System.out.println("I am in Main Method!!!");
    }
}
