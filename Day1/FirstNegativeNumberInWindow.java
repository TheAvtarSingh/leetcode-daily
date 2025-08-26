import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    static List<Integer> firstNegIntBF(int arr[], int k) {
        // write code here
        // Brute force
        List<Integer> list = new ArrayList<Integer>();
        int n = arr.length;
        int l = 0,r=k-1;
        while(r < n){
            boolean check = false;
            for(int i = l;i<=r;i++){
                if(arr[i]<0){
                    list.add(arr[i]);
                    check = true;
                    break;
                }
            }
            if(!check) list.add(0);
            l++;
            r++;
        }
        return list;
        // Use deque -> Store index and can remove the index which are out of the window
    }

    static List<Integer> firstNegIntOp(int arr[], int k) {
        // write code here
        List<Integer> list = new ArrayList<Integer>();
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        
        int l = 0;
        for(int r = 0;r<n;r++){
            
            if(arr[r] < 0){
                dq.add(r);
            }
            
            // reached window size
            if(r >= k - 1){
                
                if(!dq.isEmpty()){
                    list.add(arr[dq.peek()]);
                }else{
                    list.add(0);
                }
                
                // slide the window and remove the l index
                if(!dq.isEmpty() && dq.peek() == l){
                    dq.poll();
                }
                l++;
            }
            
            
        }
        
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstNegIntOp(arr, k);

        System.out.println(result); // Output: [-1, -1, -15, -15, 0, 0]
    }
}