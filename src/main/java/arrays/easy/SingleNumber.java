package arrays.easy;

/**
 * Problem statement
 * You are given a sorted array 'arr' of positive integers of size 'n'.
 *
 * It contains each number exactly twice except for one number, which occurs exactly once.
 *
 * Find the number that occurs exactly once.
 *
 * Example :
 * Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
 *
 * Output: 2
 *
 * Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.
 */

public class SingleNumber {
    public int getSingleElement(int[] arr){
        int singleNumber = 0;
        for(int i : arr)singleNumber ^= i;
        return singleNumber;
    }
}
