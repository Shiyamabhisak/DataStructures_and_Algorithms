package arrays.hard;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement
 * There is an integer array ‘A’ of size ‘N’.
 * Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.
 * You must return the number of inversions in the array.
 *
 * For example,
 * Input:
 * A = [5, 3, 2, 1, 4], N = 5
 * Output:
 * 7
 * Explanation:
 * The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4).
 * The number of inversions in the array is 7.
 */

public class CountInversions {
    public static int numberOfInversions(int []a, int n) {
        return mergeSort(a,0,n-1);
    }

    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low<high){
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += merge(arr,low,mid,high);
        }
        return count;
    }

    public static int merge(int[] arr, int low, int mid, int high){
        List<Integer> sortedArray = new ArrayList<>();
        int left = low, right = mid+1,count = 0;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                sortedArray.add(arr[left]);
                left++;
            }
            else{
                sortedArray.add(arr[right]);
                right++;
                count += mid - left + 1;
            }
        }

        while(left<=mid){
            sortedArray.add(arr[left]);
            left++;
        }

        while(right <= high){
            sortedArray.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = sortedArray.get(i - low);
        }

        return count;
    }
}
