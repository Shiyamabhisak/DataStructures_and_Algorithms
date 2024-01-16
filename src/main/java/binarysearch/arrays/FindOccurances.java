package binarysearch.arrays;

/**
 * There are 2 variations for this problem:
 * Variation 1:
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Variation 2:
 * Problem statement
 * You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'.
 * Find the total number of occurrences of 'x' in the array/list.
 *
 * Example:
 * Input: 'n' = 7, 'x' = 3
 * 'arr' = [1, 1, 1, 2, 2, 3, 3]
 * Output: 2
 * Explanation: Total occurrences of '3' in the array 'arr' is 2.
 */

public class FindOccurances {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1,n = nums.length, left = 0, right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target)right = mid-1;
            else if(nums[mid]<target)left = mid+1;
            else{
                first = mid;
                if(mid-1>=0 && nums[mid-1]==nums[mid])right=mid-1;
                else break;
            }
        }
        left = 0;
        right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target)right = mid-1;
            else if(nums[mid]<target)left = mid+1;
            else{
                last = mid;
                if(mid+1<n && nums[mid+1]==nums[mid])left=mid+1;
                else break;
            }
        }
        return new int[]{first,last};
    }

    public static int count(int nums[], int n, int target) {
        int first = -1, last = -1, left = 0, right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target)right = mid-1;
            else if(nums[mid]<target)left = mid+1;
            else{
                first = mid;
                if(mid-1>=0 && nums[mid-1]==nums[mid])right=mid-1;
                else break;
            }
        }
        if(first==-1)return 0;
        left = 0;
        right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target)right = mid-1;
            else if(nums[mid]<target)left = mid+1;
            else{
                last = mid;
                if(mid+1<n && nums[mid+1]==nums[mid])left=mid+1;
                else break;
            }
        }

        return last-first+1;
    }
}
