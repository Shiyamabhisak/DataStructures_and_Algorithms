package arrays.medium;

import java.util.Map;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Note: There are 2 variations for this problem, one is with given input as sorted array and the other is unsorted array. For both the cases 2 pointer works, but still it's better to know the map solution.
 */
public class TwoSum {
    public int[] twoSumUnsorted(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }

    public int[] twoSumSorted(int[] numbers, int target) {
        int arr[] = new int[2],i = 0,j = numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum>target)j--;
            else if(sum<target)i++;
            else {
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
        }
        return null;
    }
}
