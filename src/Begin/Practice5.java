package Begin;

public class Practice5 {
    public static void main(String[] args) {
        //Problem 1:
//        int n = 5;
//        for(int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        //Problem 2:
//        int sum = 0;
//        int n = 4;
//        for(int i=0; i<n; i++){
//            sum += (2 * i);
//        }
//        System.out.println("Sum of even numbers is: " + sum);


        //Problem 3:
//        int n = 5, val = 0;
//        for(int i=1; i<=10; i++){
//            val = n * i;
//            System.out.println(val);
//        }


        //Problem 4:
//        int n = 5, val = 0;
//        for(int i=10; i>=0; i--){
//            val = n * i;
//            System.out.println(val);
//        }


        //Problem 5:
//        int fact = 1, n=5;
//        for(int i=1; i<=n; i++){
//            fact *= i;
//        }
//        System.out.println(fact);

        int fact = 1, n=5, i=1;
        while(i<=n){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
