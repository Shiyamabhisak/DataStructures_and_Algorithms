package sorting;

public class SelectionSort {
    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[min] > arr[j])min = j;
            }
            if(min != i){
                arr[i] = arr[i] + arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
    }
}
