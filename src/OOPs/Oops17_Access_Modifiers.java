package OOPs;

class AB{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
    //private AB(){}//private constructor
}

//save by A.java
//    package pack;
//class A{
//    void msg(){System.out.println("Hello");}
//}
////save by B.java
//    package mypack;
//            import pack.*;
//class B{
//    public static void main(String args[]){
//        A obj = new A();//Compile Time Error
//        obj.msg();//Compile Time Error
//    }
//}
//In the above example, the scope of class A and its method msg() is default, so it cannot be accessed from outside the package.
//The protected access modifier is accessible within package and outside the package but through inheritance only.
//The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
//It provides more accessibility than the default modifier.
//save by A.java
//package pack;
//public class A{
//    protected void msg(){System.out.println("Hello");}
//}
//
////save by B.java
//    package mypack;
//            import pack.*;
//
//class B extends A{
//    public static void main(String args[]){
//        B obj = new B();
//        obj.msg();
//    }
//}

// The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
//
//        Example of public access modifier
//
//        //save by A.java
//
//        package pack;
//public class A{
//    public void msg(){System.out.println("Hello");}
//}
//
////save by B.java
//
//    package mypack;
//            import pack.*;
//
//class B{
//    public static void main(String args[]){
//        A obj = new A();
//        obj.msg();
//    }
//}

//    If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
//
//class A{
//    protected void msg(){System.out.println("Hello java");}
//}
//
//public class Simple extends A{
//    void msg(){System.out.println("Hello java");}//C.T.Error
//    public static void main(String args[]){
//        Simple obj=new Simple();
//        obj.msg();
//    }
//}

public class Oops17_Access_Modifiers {
    public static void main(String[] args) {
        AB obj=new AB();
        //System.out.println(obj.data);//Compile Time Error
        //obj.msg();//Compile Time Error
        //AB obj=new AB();//Compile Time Error

    }
}
