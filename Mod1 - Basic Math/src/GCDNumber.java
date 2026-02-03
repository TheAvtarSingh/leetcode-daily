import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GCDNumber {
    public static void main(String[] args) {
        System.out.println(computeGCDM1(12,3));
        System.out.println(computeGCDM1(12,11));
        System.out.println(computeGCDM2(1200,30));
        System.out.println(computeGCDM2(1100,1100));
        System.out.println(computeGCDElucideTheorm(1200,30));
        System.out.println(computeGCDElucideTheorm(1100,1100));
    }

    public static int computeGCDM1(int num1, int num2){
        //iterate from 1 to Min number to reduce the iteration .. and get the max number which divides the both
        int gcd =  1;
        for(int i = 1; i <= Math.min(num1,num2); i++){
        if(num1 % i == 0 && num2 % i == 0){
            gcd = i;
        }
        }
        return gcd;
    }

    public static int computeGCDM2(int num1, int num2){
//        we want max right how about if we start reverse loop
        int gcd = 1;
        for(int i = Math.min(num1,num2); i >= 1; i++){
        if(num1 % i == 0 && num2 % i == 0){
            gcd = i;
            break;
        }
        }
        return gcd;
    }

    public static int computeGCDElucideTheorm(int num1, int num2){
//        it states gcd(a,b) = gcd ( a-b,b)
//        if (0,b) then b is gcd || (a,0) a will be gcd
//        little optimsation - it changed to gcd(a%b,b)
        while(num1 > 0  && num2 > 0){
            if(num1 > num2) num1 %= num2;
            else num2 %= num1;
        }
        if(num1 == 0)return num2;
        return num1;
    }



}
