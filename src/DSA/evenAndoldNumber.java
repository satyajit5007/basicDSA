package DSA;

import java.util.Scanner;

public class evenAndoldNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        int evencount =0;
        int oldcount =0;

        while (num > 0){
            int rem = num%10; //123 ->  3%10 = 1 then go to the oldcount++

            if (rem % 2 ==0 ){
                evencount++;
            }else {
                oldcount++;
            }
            num= num/10;
        }

        System.out.println(evencount);
        System.out.println(oldcount);
    }
}
