package DSA;

import java.util.Scanner;

public class countNumberofDigits {
    public static void main(String[] args) {
        //divide and count for the use
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for the count ");

        int num= sc.nextInt();
        int count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
