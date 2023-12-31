package arrays.easy;

/**
 * Given a binary array arr, return the maximum number of consecutive 1's in the array.
 *
 * Example 1:
 *
 * Input: arr = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */

public class MaxOnes {
    public int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0, count = 0;
        for(int i : arr){
            if(i == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else count = 0;
        }
        return maxCount;
    }
}
