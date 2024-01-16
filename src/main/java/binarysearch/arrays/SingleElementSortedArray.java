package binarysearch.arrays;

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.
 *
 * Example:
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 */

public class SingleElementSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid - 1]) || (mid % 2 == 1 && nums[mid] == nums[mid + 1]))
                right = mid - 1;
            else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1]))
                left = mid + 1;
            else return nums[mid];
        }
        return -1;
    }
}
