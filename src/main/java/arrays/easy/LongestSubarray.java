package arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem statement
 * You are given an array 'a' of size 'n' and an integer 'k'.
 *
 * Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
 *
 * Example :
 * Input: ‘n’ = 7 ‘k’ = 3
 * ‘a’ = [1, 2, 3, 1, 1, 1, 1]
 *
 * Output: 3
 *
 * Explanation: Subarrays whose sum = ‘3’ are:
 *
 * [1, 2], [3], [1, 1, 1] and [1, 1, 1]
 *
 * Here, the length of the longest subarray is 3, which is our final answer.
 */

public class LongestSubarray {
    /**
     * This approch is best if the array contains only positive elements.
     */
    public int longestSubarrayWithSumK(int []nums, long k) {
        int i = 0, j = 0;
        long sum = 0;
        int longestSubarray = 0;
        while(j<nums.length){
            sum += nums[j];
            while(i<j && sum>k){
                sum -= nums[i];
                i++;
            }
            if(sum==k){
                longestSubarray = Math.max(longestSubarray, j-i+1);
            }
            j++;
        }
        return longestSubarray;
    }

    /**
     * This approch is best if the array contains both positive and negative elements.
     */
    public int getLongestSubarrayWihSumK(int []nums, int k) {
        Map<Long,Integer> map = new HashMap<>();
        long sum = 0;
        int longestSubarray = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(sum==k){
                longestSubarray = Math.max(longestSubarray, i+1);
            }
            int index = map.getOrDefault(sum-k, -1);
            if(index != -1){
                longestSubarray = Math.max(longestSubarray, i-index);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return longestSubarray;
    }
}
