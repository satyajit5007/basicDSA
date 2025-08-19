package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class checktwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter " + n1 + " elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter " + n2 + " elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean isequl = Arrays.equals(arr1,arr2);

//        boolean isequl = true;
//
//        if (n1 != n2){
//            isequl =false;
//        }else{
//            for (int i=0 ; i<n1; i++){
//                if (arr1[i] != arr2[i]){
//                    isequl =false;
//                    break;
//                }
//            }
//        }

        if (isequl) {
            System.out.println("Both arrays are equal!");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
    }
}
