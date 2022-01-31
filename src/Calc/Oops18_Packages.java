package Calc;

//There are three ways to access the package from outside the package.
//import package.*;
//import package.classname;
//fully qualified name.

////save by A.java
//    package pack;
//public class A{
//    public void msg(){System.out.println("Hello");}
//}
//
////save by B.java
//    package mypack;
//            import pack.*;
//
//class B{
//    public static void main(String args[]){
//        A obj = new A();
//        obj.msg();
//    }
//}

//Example of package by import package.classname
//
//        //save by A.java
//
//        package pack;
//public class A{
//    public void msg(){System.out.println("Hello");}
//}
//
////save by B.java
//    package mypack;
//            import pack.A;
//
//class B{
//    public static void main(String args[]){
//        A obj = new A();
//        obj.msg();
//    }
//}

//Example of package by import fully qualified name
//
//        //save by A.java
//        package pack;
//public class A{
//    public void msg(){System.out.println("Hello");}
//}
//
////save by B.java
//    package mypack;
//class B{
//    public static void main(String args[]){
//        pack.A obj = new pack.A();//using fully qualified name
//        obj.msg();
//    }
//}

//Example of Subpackage
//
//        package com.javatpoint.core;
//class Simple{
//    public static void main(String args[]){
//        System.out.println("Hello subpackage");
//    }
//}

/**
 * This class is to demonstrate what Custom Calculator is.
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

public class Oops18_Packages {
    public static void main(String[] args) {
        System.out.println("I am in Main Method!!!");
    }
}
