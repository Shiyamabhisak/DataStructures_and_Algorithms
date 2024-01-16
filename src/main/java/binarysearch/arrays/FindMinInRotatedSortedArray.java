package binarysearch.arrays;

/**
 * There are 2 variations for this problem:
 * Variation 1:
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example:
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 *
 * Variation 2:
 * Problem statement
 * You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times
 * Find the minimum value of 'r'.
 * Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'.
 *
 * Example:
 * Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]
 * Output: 3
 * Explanation:
 * If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.
 */

public class FindMinInRotatedSortedArray {
    public int findMinValue(int[] nums) {
        int n = nums.length, left = 0, right = n-1,min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1;
            }
            else{
                min =Math.min(min,nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }

    public static int findKRotation(int[] nums){
        int left = 0, right = nums.length-1,min = Integer.MAX_VALUE,rotations = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[left]<=nums[mid]){
                if(min>nums[left]){
                    min = nums[left];
                    rotations = left;
                }
                left = mid+1;
            }
            else{
                if(min>nums[mid]){
                    min = nums[mid];
                    rotations = mid;
                }
                right = mid-1;
            }
        }
        return rotations;
    }
}
