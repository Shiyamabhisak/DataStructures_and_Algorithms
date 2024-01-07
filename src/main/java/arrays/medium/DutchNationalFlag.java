package arrays.medium;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */

public class DutchNationalFlag {
    public void sortColors(int[] arr) {
        int zeroPointer = 0, onePointer = 0, twoPointer = arr.length-1;
        while(onePointer<=twoPointer){
            if(arr[onePointer]==0){
                if(zeroPointer!=onePointer){
                    int temp = arr[onePointer];
                    arr[onePointer] = arr[zeroPointer];
                    arr[zeroPointer] = temp;
                }
                zeroPointer++;
                onePointer++;
            }
            else if(arr[onePointer]==1)onePointer++;
            else {
                int temp = arr[onePointer];
                arr[onePointer] = arr[twoPointer];
                arr[twoPointer] = temp;
                twoPointer--;
            }
        }
    }
}
