package arrays.easy;

/**
 * Problem statement:
 * Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.
 *
 * Example :
 * Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
 * Output: [1, 2, 2, 3, 0, 0]
 * Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.
 */

public class MoveZeros {
    public void moveZerosToEnd(int n, int []arr) {
        int i = 0, j = 0;
        while(j<n){
            if(arr[i] == 0){
                if(i == j)j++;
                while(j<n && arr[j]==0)j++;
                if(j>=n)break;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j++;
        }
    }
}
