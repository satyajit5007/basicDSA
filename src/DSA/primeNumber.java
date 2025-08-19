package DSA;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to check?");
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = 0;

            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not Prime Number");
                }
            } else {
                System.out.println("Not Prime Number");
            }
        }
    }
}
