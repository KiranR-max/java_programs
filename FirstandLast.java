import java.sql.Array;
import java.util.Arrays;

public class FirstandLast{

public static void main(String[] args) {
    int[] nums={};
    int target=6;
    // Output: [3,4]

    int[] ans=searchRange(nums, target);
    System.out.println(Arrays.toString(ans));
    

}
static  int[] searchRange(int[] nums, int target) {
 
        // check for first occurrence if target first
        int start = search(nums, target, true);
        
        int end = search(nums, target, false);
        return new int[]{start,end};
}
static int search(int[] nums,int target,boolean findStartIndex ){
    int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

}
        
    
}

    
