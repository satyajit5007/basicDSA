package DSA;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("enter the second number" );
        int b = sc.nextInt();

        System.out.println("enter the third number");
        int c = sc.nextInt();

        int largest;
        if (a> b && a> c){
            largest = a;
        }else if (b> a  && b > c){
            largest=b;
        }else {
            largest=c;
        }
        System.out.println("largest number "+ largest);
    }
}
