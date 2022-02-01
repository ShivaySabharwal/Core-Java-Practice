package Advanced2;

/**
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 */

interface Ano1{
    public void meth1(int i);
//    public void meth2();
}

//class Ano2 implements Ano1{
//    public void display(){
//        System.out.println("Hi!!!");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}

public class AnonymousClasses_LambdaExpressions {
    public static void main(String[] args) {
//        Ano2 obj = new Ano2();
//        obj.meth1();
        //Anonymous Class
//        Ano1 obj = new Ano1() {
//            @Override
//            public void meth1() {
//                System.out.println("I am in meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am in meth 2");
//            }
//        };
//        obj.meth1();

        //Lambda Expressions
        Ano1 obj = (i)->{
            System.out.println("I am method 1 from a lambda expression." + i);
        };
        obj.meth1(9);
    }
}
