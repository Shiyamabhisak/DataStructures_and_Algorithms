package arrays.hard;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, return the number of reverse pairs in the array.
 * A reverse pair is a pair (i, j) where:
 * 0 <= i < j < nums.length and
 * nums[i] > 2 * nums[j].
 *
 * Example:
 *
 * Input: nums = [1,3,2,3,1]
 * Output: 2
 * Explanation: The reverse pairs are:
 * (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
 * (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
 */

public class ReversePairs {
    public int getCountReversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low<high){
            int mid = (low + high)/2;
            count += mergeSort(nums,low,mid);
            count += mergeSort(nums,mid+1,high);
            count += countPairs(nums,low,mid,high);
            merge(nums,low,mid,high);
        }
        return count;
    }

    public int countPairs(int[] nums,int low, int mid, int high){
        int right = mid+1, count = 0;
        for(int i = low;i <= mid;i++){
            while(right <= high && nums[i] > 2L * nums[right])right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int count = 0, left = low, right = mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                if(nums[left] > (2 * nums[right])){
                    count += mid - left + 1;
                }
                right++;
            }
        }

        while(left<=mid){
            list.add(nums[left]);
            left++;
        }

        while(right<=high){
            list.add(nums[right]);
            right++;
        }

        for(int i = low;i<=high;i++){
            nums[i] = list.get(i-low);
        }
    }
}
