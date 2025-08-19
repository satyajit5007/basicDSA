package DSA;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("now enter the array elemnt as per n");
        for (int i=0; i<n ; i++){
            arr[i]+=sc.nextInt();
        }

        int sum = 0;
        for (int j = 0 ; j<n; j++){
            sum+=arr[j];
        }
        System.out.println("sum of array "+ sum);

    }
}
