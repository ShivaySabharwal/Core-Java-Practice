package Begin;

public class Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6 % a;
        int c  = 9;
        b *= 3;
        System.out.println(b);
        System.out.println(64<6);
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>78);
        System.out.println(2&3);

        //Precedence and Associativity
        int d = 6*5-34/2;
        int e = 60/5-34*2;
        System.out.println(d);
        System.out.println(e);
    }
}
