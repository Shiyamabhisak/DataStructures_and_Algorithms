package arrays.medium;
import java.util.ArrayList;
import java.util.List;

/**
 * There is an integer array ‘arr’ of size ‘n’.
 * An element is called a Superior Element if it is greater than all the elements present to its right.
 * You must return an array all Superior Elements in the array ‘arr’.
 *
 * Note:
 * The last element of the array is always a Superior Element.
 * Example:
 * Input: arr = [1, 2, 3, 2], n = 4
 * Output: 2 3
 * Explanation:
 * arr[ 2 ] = 3 is greater than arr[ 3 ]. Hence it is a Superior Element.
 * arr[ 3 ] = 2 is the last element. Hence it is a Superior Element.
 * The final answer is in sorted order.
 */

public class SuperiorElements {
    public List<Integer> leadersInAnArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        return list;
    }
}
