package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * Example:
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */

public class MergeIntervals {
    public int[][] mergeOverlappingSubIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int x = Integer.MAX_VALUE, y = intervals[0][1];
        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0]<=y){
                x = Math.min(x,intervals[i][0]);
                y = Math.max(y,intervals[i][1]);
            }
            else{
                list.add(new int[]{x,y});
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }
        list.add(new int[]{x,y});
        int n = list.size();
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            int[] temp = list.get(i);
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }
        return arr;
    }
}
