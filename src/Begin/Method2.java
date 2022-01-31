package Begin;

import java.util.Scanner;

public class Method2 {

//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }

    static int sum(int ...arr){
        //Available as int []arr;
        int result = 0;
        for(int a=0; a< arr.length; a++){
            result += arr[a];
        }
        return result;
    }

    static int factorial(int n){
//        int result = 1;
//        for (int i=n; i>0; i--){
//            result *= i;
//        }
//        return result;
        if(n==0 || n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }

    int fib(int n){
        // Declare an array to store Fibonacci numbers. 1 extra to handle case, n = 0
        int []f = new int[n+2];
        int i = 0;
        // 0th and 1st number of the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for(i = 2; i <= n; i++){
            //Add the previous 2 numbers in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }


    static int fibbo(int n){
        if(n <= 1){
            return n;
        }
        return fibbo(n-1) + fibbo(n-2);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs and Recursion!!!");
        System.out.println("The Sum of Nothing is: " + sum());
        System.out.println("The Sum of 4 and 5: " + sum(4, 5));
        System.out.println("The Sum of 4, 5 and 7: " + sum(4, 5, 7));

        System.out.println("The factorial of 5 is: " + factorial(5));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for fibonacci: ");
        int k = sc.nextInt();
        System.out.println("The fibonacci sum till " + k + " is: " + fibbo(k));

        Method2 obj1 = new Method2();
        System.out.println("The fibonacci sum using for loop till " + k + " is: " + obj1.fib(k));
    }
}
