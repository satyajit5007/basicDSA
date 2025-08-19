package DSA;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many checks");
        int t = sc.nextInt();
        while (t-- >0){
            System.out.println("enter the number");
            int num = sc.nextInt();
            long factroial = 1;
            for(int i = 1 ; i<= num ; i++){
                factroial=factroial*i;
            }
            System.out.println("factorial of num "+ factroial);
        }
    }
}
