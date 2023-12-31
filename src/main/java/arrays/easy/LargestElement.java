package arrays.easy;

/**
 * Problem statement:
 * Given an array ‘arr’ of size ‘n’ find the largest element in the array.
 *
 * Example:
 * Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
 * Output: 5
 * Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
 */

public class LargestElement {
    public int max = Integer.MIN_VALUE;
    public int findLargestElementRecursion(int[] arr, int n) {
        if(n == 0)return max;
        max = Math.max(max,arr[n-1]);
        return findLargestElementRecursion(arr, n-1);
    }

    public int findLargestElementIteration(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            max = Math.max(element,max);
        }
        return max;
    }
}
