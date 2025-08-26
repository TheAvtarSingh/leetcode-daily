// write problem statment
// Given an array of integers and a number k, find the maximum sum of a subarray of size k.
// write question code only


public class Solution {

    // Core logic method
    public static int solve(int[] arr, int k) {
        int n = arr.length;
        if(n < k) return -1;
        
        // slide to k
        int currSum = 0;
        for(int i = 0;i<k;i++){
            currSum += arr[i];
        }
        
        // move win
        int maxSum = currSum;
        for(int right = k;right < n;right++){
            currSum += arr[right] - arr[right - k];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // Call solve method
        int result = solve(arr, k);

        // Print result
        System.out.println("Result: " + result);
    }
}
