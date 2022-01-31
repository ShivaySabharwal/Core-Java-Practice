package OOPs;

//INHERITANCE IN CASE OF CONSTRUCTORS
class Base1{
    private int var1 = 0;
    Base1(){
        System.out.println("I am a NoArgs Constructor in Base Class.");
    }
    Base1(int var2){
        var1 = var2;
        System.out.println("I am a Parameterized Constructor in Base Class with value of var1 = " + var1 + ".");
    }
}
class Derived1 extends Base1{
    private int var3 = 0, var4 = 0;
    Derived1(){
        System.out.println("I am a NoArgs Constructor in Derived Class.");
    }
    Derived1(int var5, int var6){
        super(12);
        var3 = var5;
        var4 = var6;
        System.out.println("I am a Parameterized Constructor in Derived Class with values of var3 and var4 = " + var3 + " " + var4 + " respectively.");
    }
}
class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class Oops7_Inheritance_Constructors {
    public static void main(String[] args) {
        Base1 b1 = new Base1();
        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(13,2);
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
