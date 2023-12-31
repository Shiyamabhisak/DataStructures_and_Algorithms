package arrays.easy;

/**
 * Given an array arr containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 * Example 1:
 *
 * Input: arr = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in arr.
 */

public class MissingNumber {
    public int missingNumberInArray(int[] arr) {
        int n = arr.length, expectedSum = (n*(n+1))/2, sum = 0;
        for(int element : arr)sum+=element;
        return expectedSum-sum;
    }
}
