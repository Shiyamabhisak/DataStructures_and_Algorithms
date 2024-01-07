package arrays.medium;
import java.util.Arrays;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxSeq = 0, lastEle = Integer.MIN_VALUE, seqCount = 0;
        for (int i : nums) {
            if (lastEle != i - 1) {
                if (lastEle == i) continue;
                lastEle = i;
                seqCount = 1;
            } else {
                lastEle = i;
                seqCount++;
            }
            maxSeq = Math.max(maxSeq, seqCount);
        }
        return maxSeq;
    }
}
