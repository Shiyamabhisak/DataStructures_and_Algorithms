package arrays.hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 *
 * Example:
 *
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */

public class FourSum {
    public List<List<Integer>> getFourSums(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j = i+1;j<n;j++){
                if(j > i+1 && nums[j] == nums[j-1])continue;
                int k = j+1, l = n-1;
                while(k<l){
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if(sum<target)k++;
                    else if(sum>target)l--;
                    else{
                        quadruplets.add(Arrays.asList(nums[i],nums[j],nums[k++],nums[l--]));
                        while(k<l && nums[k] == nums[k-1])k++;
                    }
                }
            }
        }
        return quadruplets;
    }
}
