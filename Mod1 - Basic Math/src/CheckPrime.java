

//Example 1:
//Input:N = 2
//
//Output:True
//
//Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
//
//Example 2:
//Input:N =10
//
//Output: False
//
//Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.


public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(10));
        System.out.println(isPrimeOp(2));
        System.out.println(isPrimeOp(10));
        System.out.println(isPrimeOp(9));
    }

    public static boolean isPrime(int n){
        int count = 0;
        for(int i =1;i<n;i++){
            if(n%i==0 && count>=2){
                return false;
            }
            count++;
        }
        return true;
    }

    public static boolean isPrimeOp(int n){
       int count = 1;
       for(int i = 2;i*i<=n;i++){
           if(n%i==0) return false;
       }
       return true;
    }
}
