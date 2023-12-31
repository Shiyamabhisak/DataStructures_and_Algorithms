package arrays.easy;

/**
 * Problem statement:
 * You have been given an array ‘a’ of ‘n’ unique non-negative integers.
 *
 * Find the second largest and second smallest element from the array.
 *
 * Return the two elements (second largest and second smallest) as another array of size 2.
 *
 * Example :
 * Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
 * Output: [4, 2]
 * Explanation:
 * The second largest element after 5 is 4, and the second smallest element after 1 is 2.
 */

public class SecondOrderElements {
    public int[] getSecondOrderElements(int n, int []a) {
        int largest = 0, secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i : a){
            if(largest < i){
                secondLargest = largest;
                largest = i;
            }
            else{
                if(secondLargest < i)secondLargest = i;
            }
            if(smallest > i){
                secondSmallest = smallest;
                smallest = i;
            }
            else{
                if(secondSmallest > i)secondSmallest = i;
            }
        }
        return new int[]{secondLargest,secondSmallest};
    }
}
