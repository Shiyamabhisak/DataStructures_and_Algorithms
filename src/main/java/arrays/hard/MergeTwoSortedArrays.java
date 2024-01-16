package arrays.hard;
import java.util.Arrays;

/**
 * Three are 2 variations for this problem.
 * Variation 1:
 * Problem statement
 * Given two non-decreasing sorted arrays, ‘A’ and ‘B’, having ‘N’ and ‘M’ elements, respectively.
 * You must merge these arrays, ‘A’ and ‘B’, into a sorted array without using extra space. Of all the 'N + M' sorted elements, array 'A' should contain the first 'N' elements, and array 'B' should have the last 'M' elements.
 *
 * Note:
 * You must perform the merge operation in place and must not allocate any extra space to merge the two arrays.
 * For example:
 * When ‘N’ = 4, ‘A’ = {1, 4, 5, 7} and ‘M’ = 3, ‘B’ = {2, 3, 6}.
 * We can merge these two arrays into {1, 2, 3, 4, 5, 6, 7} (The elements of ‘A’ are {1, 2, 3, 4} ).
 * Hence, the answer is {1, 2, 3, 4, 5, 6, 7}.
 *
 * Variation 2:
 * You are given two integer arrays a and b, sorted in non-decreasing order, and two integers m and n, representing the number of elements in a and b respectively.
 * Merge a and b into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array a. To accommodate this, a has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. b has a length of n.
 *
 * Example:
 *
 * Input: a = [1,2,3,0,0,0], m = 3, b = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class MergeTwoSortedArrays {
    public static void sortTheArraysWithoutMerging(long[] a, long[] b){
        int i = a.length-1, j = 0;
        while(i>=0 && j<b.length){
            if(a[i]>b[j]){
                long t1 = a[i];
                a[i] = b[j];
                b[j] = t1;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public void mergeInTheFirstArray(int[] a, int m, int[] b, int n) {
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            a[i--] = (p1 >= 0 && a[p1] > b[p2]) ? a[p1--] : b[p2--];
        }
    }
}
