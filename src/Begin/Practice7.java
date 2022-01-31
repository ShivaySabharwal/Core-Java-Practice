package Begin;

public class Practice7 {

    static void multiplication(int n){
        for(int i=0; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    void ArrRev(int []arr){
//
//    }

    static int recsum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+recsum(n-1);
        }
    }

    static void pattern2(int n){
        for(int i=n-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
//    int main() {
//        int t1 = 0, t2 = 1, nextTerm = 0, n;
//        printf("Enter a positive number: ");
//        scanf("%d", &n);
//
//        // displays the first two terms which is always 0 and 1
//        printf("Fibonacci Series: %d, %d, ", t1, t2);
//        nextTerm = t1 + t2;
//
//        while (nextTerm <= n) {
//            printf("%d, ", nextTerm);
//            t1 = t2;
//            t2 = nextTerm;
//            nextTerm = t1 + t2;
//        }
//
//        return 0;
//    }

    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    static float avgfun(int ...arr){
        float sum = 0.0f;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        float average = (sum/arr.length);
        return average;
    }

    float FarToCel (float FarVal){
        float result = (float) ((FarVal-32.0) * (5.0/9.0));
        return result;
    }

    public static void main(String[] args) {
        multiplication(7);
        pattern1(5);
        System.out.println("The sum of first 10 natural numbers: " + recsum(10));
        pattern2(5);
        System.out.println("The sum of all the fibonacci series till 10 is: " + fib(10));
        System.out.println("The average of all these numbers is: " + avgfun(10, 11, 43, 56, 76));
        Practice7 obj1 = new Practice7();
        System.out.println("Celsius conversion value of 168 Fahrenheit is: " + obj1.FarToCel(168));
    }
}