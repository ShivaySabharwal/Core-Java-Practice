package Folder.FolderL1.FolderL2;

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
