package arrays.easy;
import java.util.List;

/**
 * Problem statement:
 * You are given a sorted integer array 'arr' of size 'n'.
 *
 * You need to remove the duplicates from the array such that each element appears only once.
 *
 * Return the length of this new array.
 *
 * Note:
 * Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory.
 *
 * For example:
 * 'n' = 5, 'arr' = [1 2 2 2 3].
 * The new array will be [1 2 3].
 * So our answer is 3.
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(List<Integer> arr) {
        int count = 0, prev = 0;
        for(int i : arr){
            if(prev != i){
                count++;
                prev = i;
            }
        }
        return count;
    }
}
