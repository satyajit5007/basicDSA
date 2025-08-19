package DSA;

import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberandString {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("total checks");
//        int t = sc.nextInt();
//        while (t-- >0){
//            Random rand = new Random();
//
//            int randInt = rand.nextInt(100);
//            System.out.println(randInt);
//        }
        //check with rand numbers

//        float rand = (float) (Math.random()*10);
//
//        System.out.println(rand);

        String randString = RandomStringUtils.randomNumeric(100);
        System.out.println(randString);

        String randstr = RandomStringUtils.randomAlphabetic(100);
        System.out.println(randstr);


    }
}
