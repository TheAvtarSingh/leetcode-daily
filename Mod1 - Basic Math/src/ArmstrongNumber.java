
//Example 1:
//Input:N = 153
//Output:True
//Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
//
//Example 2:
//Input:N = 371
//Output: True
//Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371
//

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armStrongNumber(153));
        System.out.println(armStrongNumber(371));
        System.out.println(armStrongNumber(11));
        System.out.println(armStrongNumber(0));
        System.out.println(armStrongNumber(9474));
    }

    public static boolean armStrongNumber(int num) {
        int numOfDigit = (int)Math.log10(num)+1;
        int temp = num;
        int sum =0;
        while(temp!=0){
            int n =  temp%10;
            n = (int)Math.pow(n,numOfDigit);
            sum += n;
            temp = temp/10;
        }
        return sum == num;
    }
}
