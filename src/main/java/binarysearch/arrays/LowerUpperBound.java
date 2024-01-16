package binarysearch.arrays;

/**
 * There are 3 variations for this problem:
 * Variation 1:
 * Problem statement
 * You are given an array 'arr' sorted in non-decreasing order and a number 'x'.
 * You must return the index of lower bound of 'x'.
 *
 * Note:
 * For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'
 * If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
 * Consider 0-based indexing.
 * Example:
 * Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0
 * Output: 0
 * Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.
 *
 * Variation 2:
 * Problem statement
 * You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
 * Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.
 *
 * Note:
 * The upper bound in a sorted array is the index of the first value that is greater than a given value.
 * If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
 * We are using 0-based indexing.
 * Try to write a solution that runs in log(n) time complexity.
 * Example:
 * Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,
 * Output: 2
 * Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).
 *
 * Variation 3:
 * Problem statement
 * You're given a sorted array 'a' of 'n' integers and an integer 'x'.
 * Find the floor and ceiling of 'x' in 'a[0..n-1]'.
 *
 * Note:
 * Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
 * Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.
 * Example:
 * Input:
 * n=6, x=5, a=[3, 4, 7, 8, 8, 10]
 * Output:
 * 4
 * Explanation:
 * The floor and ceiling of 'x' = 5 are 4 and 7, respectively.
 */

public class LowerUpperBound {
    public int lowerBound(int []arr, int n, int x) {
        int left = 0, right = n-1,lb = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>=x){
                lb = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return lb;
    }

    public static int upperBound(int []arr, int x, int n){
        int left = 0, right = n-1,ub = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>x){
                ub = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ub;
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int floor = -1, ceil = -1, left = 0, right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(a[mid] == x){
                floor = a[mid];
                ceil = a[mid];
                break;
            }
            else if(a[mid]>x){
                ceil = a[mid];
                right = mid-1;
            }
            else{
                floor = a[mid];
                left = mid+1;
            }
        }
        return new int[]{floor,ceil};
    }
}
