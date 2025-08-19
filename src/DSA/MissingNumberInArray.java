package DSA;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sumArray = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i]+=sc.nextInt();
            sumArray +=arr[i];
        }
        //sumArray

        int totalNumber = n+1;


        int sumFull = totalNumber * (totalNumber+1)/2;



        int missing = sumFull - sumArray;
        System.out.println(missing);


    }
}
