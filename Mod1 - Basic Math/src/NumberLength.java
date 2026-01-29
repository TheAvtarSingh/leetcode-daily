//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//Problem Statement: Given an integer N, return the number of digits in N.
//
//Examples
//Example 1:
//Input:N = 12345
//Output:5
//Explanation:  The number 12345 has 5 digits.
//
//        Example 2:
//Input:N = 7789
//Output: 4
//Explanation: The number 7789 has 4 digits.
public class NumberLength {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       System.out.println(countBf(12345));
       System.out.println(countBf(7789));
        System.out.println(countOp(12345));
        System.out.println(countOp(7789));

//        New Point
        System.out.println(newSol(12345));
        System.out.println(newSol(7789));
    }

//    convert to string , iterate and check the size
    public static int countBf(int digit){
        String num = Integer.toString(digit);
        return num.length();
    }

    //   math version divide the digit until num =0
    public static int countOp(int digit){
       int count  =0 ;
       while(digit>0){
           digit=digit/10;
           count++;
       }
       return count;
    }

    //  The logarithmic base 10 of a positive integers
    //  gives the number of digits in n. We add 1 to the
    //  result to ensure that the count is correct even for numbers that are powers of 10.
    public static int newSol(int digit){

        return (int) (Math.log10(digit)+1);
    }
}

