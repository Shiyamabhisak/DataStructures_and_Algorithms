package arrays.easy;

/**
 * Problem statement:
 * Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
 *
 * Example:(Left Rotation)
 * 'arr '= [1,2,3,4,5]
 * 'k' = 1  rotated array = [2,3,4,5,1]
 * 'k' = 2  rotated array = [3,4,5,1,2]
 * 'k' = 3  rotated array = [4,5,1,2,3] and so on.
 *
 * Example:(Right Rotation)
 *  * 'arr '= [1,2,3,4,5]
 *  * 'k' = 1  rotated array = [5,1,2,3,4]
 *  * 'k' = 2  rotated array = [4,5,1,2,3]
 *  * 'k' = 3  rotated array = [3,4,5,1,2] and so on.
 */

public class Rotation {
    public void leftRotateArray(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public void rightRotateArray(int[] arr, int k){
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n-1-k);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
