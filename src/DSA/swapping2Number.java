package DSA;

public class swapping2Number {
    public static void main(String[] args) {

       int a=10, b=20;
        System.out.println("before Swapping " + a + " "+ b);

       //logic 1 -> using third variable
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping "+ a+" "+b);

        //logic 2 -> use + -
//        a = a+ b;
//        b= a-b;
//        a= a-b;
//        System.out.println("After Swapping "+ a+" "+b);

        //logic3 use * and non zero values
        a=a*b;
        b = a/b;
        a=a/b;
        System.out.println("After Swapping "+ a+" "+b);


    }
}

