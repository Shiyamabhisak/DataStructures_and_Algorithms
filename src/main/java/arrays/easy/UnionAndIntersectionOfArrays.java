package arrays.easy;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement:
 * Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.
 *
 * The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of the two arrays. The final array should be sorted in ascending order.
 *
 * Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.
 *
 * Example:
 * Input: ‘n’ = 5 ‘m’ = 3
 * ‘a’ = [1, 2, 3, 4, 6]
 * ‘b’ = [2, 3, 5]
 *
 * Output: [1, 2, 3, 4, 5, 6]
 *
 * Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
 * Distinct elements in ‘a’ are: [1, 4, 6]
 * Distinct elements in ‘b’ are: [5]
 * Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
 *
 *The intersection of two sorted arrays can be defined as an array consisting of the common elements of the two arrays. The final array should be sorted in ascending order.
 *
 * Example:
 * Input: ‘n’ = 5 ‘m’ = 3
 *  a’ = [1, 2, 3, 4, 6]
 * ‘b’ = [2, 3, 5]
 *
 * Output: [2,3]
 *
 * Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
 * Intersection of ‘a’ and ‘b’ is: [2,3]
 */

public class UnionAndIntersectionOfArrays {
    public List< Integer > unionOfSortedArrays(int []a, int []b) {
        List<Integer> mergedUnionArray = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            while(i < a.length-1 && a[i]==a[i+1])i++;
            while(j < b.length-1 && b[j]==b[j+1])j++;
            if(a[i] < b[j]){
                mergedUnionArray.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                mergedUnionArray.add(b[j]);
                j++;
            }
            else{
                mergedUnionArray.add(a[i]);
                i++;
                j++;
            }
        }

        while(i < a.length){
            mergedUnionArray.add(a[i]);
            i++;
        }

        while(j < b.length){
            mergedUnionArray.add(b[j]);
            j++;
        }

        return mergedUnionArray;
    }

    public List< Integer > intersectionOfSortedArrays(int []a, int []b) {
        List<Integer> mergedIntersectionArray = new ArrayList<>();
        int i = 0, j = 0;
        int length1 = a.length, length2 = b.length;
        while(i<length1 && j<length2){
            if(a[i]<b[j])i++;
            else if(a[i]>b[j])j++;
            else{
                mergedIntersectionArray.add(a[i]);
                i++;
                j++;
            }
        }
        return mergedIntersectionArray;
    }
}

