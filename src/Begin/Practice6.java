package Begin;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        //Problem 1
//        float [] vals = {34.67f, 56.87f, 44.63f, 24.6f, 67.99f};
//        System.out.print("The length of the array is: ");
//        System.out.println(vals.length);
//        float sum = 0;
//        for (int i=0; i< vals.length; i++){
//            sum += vals[i];
//        }
//        System.out.println("The sum of all the values in the given array is: " + sum);


        //Problem 2
//        float [] vals1 = {34.67f, 56.87f, 44.63f, 24.6f, 67.99f};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value to check: ");
//        float CheckValue = sc.nextFloat();
//
//        for (int j=0; j< vals1.length; j++){
//            if (CheckValue == vals1[j]){
//                System.out.println(CheckValue + " is present in the given array");
//                break;
//            }
//            else{
//                System.out.println(CheckValue + " is not present in the array");
//                break;
//            }


//            float [] vals1 = {34.67f, 56.87f, 44.63f, 24.6f, 67.99f};
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the value to check: ");
//            boolean isInArray = false;
//            float CheckValue = sc.nextFloat();
//
//            for (int j=0; j< vals1.length; j++){
//                if(CheckValue == vals1[j]){
//                    isInArray = true;
//                    break;
//                }
//            }
//            if (isInArray){
//                System.out.println(CheckValue + " is present in the given array");
//            }
//            else{
//                System.out.println(CheckValue + " is not present in the array");
//            }


        //Problem 3
//        float [] vals1 = {34.67f, 56.87f, 44.63f, 24.6f, 67.99f};
//        float sum = 0;
//        for (float element: vals1){
//            sum += element;
//        }
//        System.out.println("The value of average marks is: " + sum/ vals1.length);


        //Problem 4
//        int [][] mat1 = {{1,2,3}, {4,5,6}};
//        int [][] mat2 = {{7,8,9}, {10,11,12}};
//        int [][] result = {{0,0,0}, {0,0,0}};
//
//        for (int i=0; i<mat1.length; i++){ //row number of times
//            for (int j=0; j< mat1[i].length; j++){ //column number of times
//                result [i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int k=0; k< result.length; k++){
//            for (int l=0; l<result[k].length; l++){
//                System.out.print(result[k][l] + " ");
//            }
//            System.out.println("");
//        }


        //Problem 5
//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int temp = 0;
//        int n = Math.floorDiv(l, 2);
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for(int k=0; k< arr.length; k++){
//            System.out.print(arr[k] + " ");
//        }


        //Problem 6
//        int [] arr = {1,2,3,4,5,98,22,33};
//        int max = 0;
//        for(int e: arr){
//            if (e > max) {
//                max = e;
//            }
//        }
//        System.out.println("The greatest element is: " + max);


        //Problem 7
        int [] arr = {1,4,5,8,-3};
        boolean isSorted = true;
        for (int i=0; i< arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}