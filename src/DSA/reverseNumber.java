package DSA;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        //1 using the algoritham
        int rev = 0;
        while (num !=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("reverse number " + rev);
    }
}
