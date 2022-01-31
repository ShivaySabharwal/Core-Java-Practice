package Begin;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using Loops:-");
        int i = 100;
        while (i <= 200){
            System.out.print(i);
            i++;
        }


        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a<3);


        for(int d=1; d<=10; d++){
            System.out.print(d + ", ");
        }


//        Print first n odd numbers using for loop
//         2n = Even Numbers = 0, 2, 4, 6, 8
//         2n+1 = Odd Numbers = 1, 3, 5, 7, 9
        int n = 5;
        for (int k=0; k<n; k++){
            System.out.println((2*k)+1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to start from: ");
        int ni = sc.nextInt();
        for(int p=ni; p>=0; p--){
            System.out.println(p);
        }


        int j = 0;
        while(j<5){
            System.out.println(j);
            System.out.println("Java is Great!!!");
            if(j==2){
                System.out.println("Breaking the loop");
                break;
            }
            j++;
        }
        System.out.println("The loop ends here!");


        for(int l=0; l<5; l++){
            if(l==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(l);
            System.out.println("Java is great!");
        }
        int g = 0;
        while(g<5){
            g++;
            if(g==2){
                System.out.println("Continuing the loop");
                continue;
            }
            System.out.println(g);
            System.out.println("Java is Great!!!");
        }
        System.out.println("The loop ends here!");
    }
}