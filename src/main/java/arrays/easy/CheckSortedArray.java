package arrays.easy;

/**
 * Problem statement:
 * You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.
 *
 * Your task is to return 1 if the given array is sorted. Else, return 0.
 *
 * Example :
 * Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
 * Output: 1
 * Explanation:
 * The given array is sorted in non-decreasing order; hence the answer will be 1
 */

public class CheckSortedArray {
    public int isSortedRecursive(int n, int[] arr) {
        if(n == 1)return 1;
        if(arr[n-1]<arr[n-2])return 0;
        return isSortedRecursive(n-1, arr);
    }

    public int isSortedIterative(int[] arr){
        int prevElement = Integer.MIN_VALUE;
        for(int element : arr){
            if(element<prevElement)return 0;
            prevElement=element;
        }
        return 1;
    }

}
