package arrays.hard;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * Example:
 *
 * Input: nums = [3,2,3]
 * Output: [3]
 */

public class LongestZeroSumSubArray {
    public static int getLongestZeroSumSubarrayLength(int[] nums){
        Map<Long,Integer> map = new HashMap<>();
        long sum = 0;
        int longestSubarray = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(sum==0){
                longestSubarray = Math.max(longestSubarray, i+1);
            }
            else{
                int index = map.getOrDefault(sum, -1);
                if(index != -1){
                    longestSubarray = Math.max(longestSubarray, i-index);
                }
                else{
                    map.put(sum, i);
                }
            }

        }
        return longestSubarray;
    }
}
