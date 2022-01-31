package Begin;

public class Conditionals {
    public static void main(String[] args) {
        int age = 56;
        boolean cond = (age>=18);
        if(cond){
            System.out.println("Yes!!!, you can drive.");
        }
        else{
            System.out.println("No, you cannot drive yet.");
        }

        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("Not(a) is: " + !a);
        System.out.println("Not(b) is: " + !b);
    }
}
