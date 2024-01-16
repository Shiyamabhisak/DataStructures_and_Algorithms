package arrays.hard;

/**
 * Problem statement
 * You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.
 * Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.
 * Your task is to find ‘P’ and ‘Q’ and return them respectively.
 *
 * Example:
 * Input: ‘N’ = 4
 * ‘A’ = [1, 2, 3, 2]
 * Output: {2, 4}
 * Explanation: The integer appearing twice is ‘2’, and the integer missing is ‘4’.
 */

public class RepeatingMissingNumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        long n = a.length, actualSumOfNnos = 0, actualSumOfSqOfNnos = 0, expectedSumOfNnos = (n*(n+1))/2, expectedSumOfSqNnos = (n*(n+1)*((2*n)+1))/6;
        for(int i : a){
            actualSumOfNnos += i;
            actualSumOfSqOfNnos += (i*i);
        }
        int pminusq = (int)(actualSumOfNnos - expectedSumOfNnos), pplusq = (int)((actualSumOfSqOfNnos - expectedSumOfSqNnos)/pminusq);
        int p = (pminusq + pplusq)/2, q = pplusq - p;

        return new int[]{p,q};
    }
}
