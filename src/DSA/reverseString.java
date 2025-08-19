package DSA;

public class reverseString {

    //1 using the concatenation operator
    public static void main(String[] args) {

        String str = "ABCD";
        String rev = " ";

//        int len = str.length();
//
//        for (int i= len-1; i>=0 ; i--){
//            rev= rev+str.charAt(i);
//        }

        //2 using the character array

//        char a[] = str.toCharArray();
//        //convert the string into the char
//        int len = a.length;
//        for (int i = len-1; i>=0 ; i--){
//            rev = rev+a[i]+" ";
//        }
//        System.out.println(rev);

        //3 using the String buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());



    }

}
