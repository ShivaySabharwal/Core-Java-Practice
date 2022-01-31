package Begin;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        float a = 7/4 * 9/2;
        float b = 7/4f * 9/2f;
        System.out.println(a);
        System.out.println(b);

        char grade = 'B';
        char enc_grade = (char)(grade + 8);
        System.out.println(enc_grade);
        char dec_grade = (char)(enc_grade - 8);
        System.out.println(dec_grade);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value  = sc.nextInt();
        System.out.println(value>8);
    }
}
