package arrays.hard;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers A and an integer B.
 * Find the total number of subarrays having bitwise XOR of all elements equals to B.
 *
 * Example:
 * A = [4, 2, 2, 6, 4]
 * B = 6
 * Explanation: The subarrays having XOR of their elements as 6 are:
 *  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
 */

public class NumberOfSubArraysWithXorK {
    public int getNumberOfSubArraysWithXorK(int[] A, int B) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int xor = 0,count = 0;
        for(int i : A){
            xor ^= i;
            if(map.containsKey(xor ^ B)){
                count += map.get(xor ^ B);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
