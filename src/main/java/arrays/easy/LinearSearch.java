package arrays.easy;

/**
 * Problem statement:
 * You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is to find whether ‘num’ is present in the array or not.
 *
 * If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.
 *
 * Example:
 * Input: ‘n’ = 5, ‘num’ = 4
 * 'arr' =  [6,7,8,4,1]
 *
 * Output: 3
 *
 * Explanation:
 * 4 is present at the 3rd index.
 */

public class LinearSearch {
    public int recursiveLinearSearch(int n, int num, int[] arr){
        if(n==0)return -1;
        int x = recursiveLinearSearch(n-1, num, arr);
        if(x != -1 || arr[n-1] != num)return x;
        else return n-1;
    }

    public int iterativeLinearSearch(int num, int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num)return i;
        }
        return -1;
    }
}
