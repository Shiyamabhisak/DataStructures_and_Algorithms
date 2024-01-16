package arrays.hard;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement
 * Ninja is given an array ‘Arr’ of size ‘N’. You have to help him find the longest subarray of ‘Arr’, whose sum is 0. You must return the length of the longest subarray whose sum is 0.
 *
 * For Example:
 * For N = 5, and Arr = {1, -1, 0, 0, 1},
 * We have the following subarrays with zero sums:
 * {{1, -1}, {1, -1, 0}, {1, -1, 0, 0}, {-1, 0, 0, 1}, {0}, {0, 0}, {0}}
 * Among these subarrays, {1, -1, 0, 0} and {-1, 0, 0, 1} are the longest subarrays with their sum equal to zero. Hence the answer is 4.
 */

public class OneThirdMajorityElement {
    public List<Integer> listMajorityElements(int[] nums) {
        List<Integer> majority = new ArrayList<>();
        int n = nums.length, count1 = 0, count2 = 0, element1 = Integer.MIN_VALUE, element2 = Integer.MAX_VALUE;
        for(int i : nums){
            if(count1 == 0 && element2 != i){
                element1 = i;
                count1=1;
            }
            else if(count2 == 0 && element1 != i){
                element2 = i;
                count2=1;
            }
            else if(element1 == i)count1++;
            else if(element2 == i)count2++;
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i : nums){
            if(i == element1)count1++;
            if(i == element2)count2++;
        }

        if(count1 > n/3)majority.add(element1);
        if(count2 > n/3)majority.add(element2);

        return majority;
    }
}
