package arrays.medium;

/**
 * Given an integer array nums, find the
 * subArray with the largest sum, and return its sum.
 *
 * Example:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 *
 * Note: There are 2 variations for this problem one is to find the maximum sum of subArray and other is to find the subArray. If multiple subArrays exist then any one of the subArray is returned.
 */

public class MaximumSubArraySum {
    public int getMaxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i : arr){
            sum += i;
            if(maxSum<sum)maxSum=sum;
            if(sum<0)sum=0;
        }
        return maxSum;
    }

    public int[] getMaxSumSubArray(int[] arr){
        if(arr.length == 0 || arr == null)return new int[]{};
        int sum = 0, maxSum = Integer.MIN_VALUE,temp = 0,start = -1,end = -1;
        for(int i = 0;i<arr.length;i++){
            if(sum == 0)temp = i;
            sum += arr[i];
            if(maxSum < sum){
                maxSum = sum;
                start = temp;
                end = i;
            }
            if(sum<0)sum=0;
        }

        int[] subArr = new int[end-start+1];
        for(int i = start;i<=end;i++){
            subArr[i-start] = arr[i];
        }
        return subArr;
    }
}
