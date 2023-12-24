package sorting;

public class MergeSort {
    public void sort(int[] arr,int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] arr, int low,int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left <= mid && right <= high){
            if(arr[left]>arr[right]){
                temp[i] = arr[right];
                right++;
            }
            else{
                temp[i] = arr[left];
                left++;
            }
            i++;
        }

        while(left<=mid){
            temp[i] = arr[left];
            left++;
            i++;
        }

        while(right<=high){
            temp[i] = arr[right];
            right++;
            i++;
        }

        i = 0;
        for(int k = low;k <= high;k++){
            arr[k] = temp[i++];
        }
    }
}
