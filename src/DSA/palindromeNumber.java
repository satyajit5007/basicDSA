package DSA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int orgnum = num;
        int rev = 0;

        while(num!=0){
            rev= rev*10 + num %10 ; // -> 0+4  4+3  43+2  432+1
            num = num /10;          // -> updatation of the number 1234 123 12 1
        }
        if (orgnum == rev){
            System.out.println(orgnum + " these is the palidrome number");
        } else {
            System.out.println(orgnum + " thes is not palindrome number");
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number : ");
//        int num = sc.nextInt();
//
//        int orgnum = num;
//
//        int rev = 0;
//
//        while (num!=0){
//            rev = rev*10 + num%10;
//            num = num/10;
//        }
//
//        if (orgnum == rev){
//            System.out.println(orgnum + " Palindrome Number");
//        } else {
//            System.out.println(orgnum + " Not Palindorme Number");
//        }
//
//    }
}
