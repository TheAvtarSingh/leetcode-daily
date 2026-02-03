
//Input: N = 36
//Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
//Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
//Input: N = 12
//Output: [1, 2, 3, 4, 6, 12]
//Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
public class PrintAllDivisors {
    public static void main(String[] args) {
        printAllDivisors(36);
        printAllDivisors(12);
        printAllDivisorsOp(36);
        printAllDivisorsOp(12);
    }

    public static void printAllDivisors(int n) {
        for(int i=1;i<=n;i++) {
            if (n%i==0) System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printAllDivisorsOp(int n) {
//        reduce the iternations to half
        for(int i = 1;i * i <= n ;i++){
            if(n % i == 0) {
                System.out.print(i + " ");
                if(i != n/i) System.out.print( n/i+" ");
            }

        }
        System.out.println();
    }
}
