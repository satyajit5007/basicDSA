package DSA;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum =0;
        int temp = num;

        while (temp > 0){
            int lastdigit = temp %10;
            sum = sum + lastdigit;
            temp= temp/10;
        }
        System.out.println("sum of digit " +num +" "+  sum);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int num = sc.nextInt();
//        int sum =0;
//        int temp = num;
//
//        while (temp > 0){
//            int lastdigit = temp%10;
//            sum +=lastdigit;
//            temp = temp/10;
//        }
//        System.out.println("sum of digits " +num+" " + sum);
//    }

}
