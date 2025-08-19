package DSA;

import java.util.Scanner;

public class PrintEvenandOddNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even Numbers In array");
        for (int i = 0 ; i< n; i++){
            if (arr[i] % 2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");

        System.out.println("old Numbers In array");
        for (int i = 0 ; i< n; i++){
            if (arr[i] % 2==1){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
