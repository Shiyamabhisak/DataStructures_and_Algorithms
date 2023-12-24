package sorting;

public class InsertionSort {
    public void iterativeSort(int[] arr){
        int n = arr.length;
        int c = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    arr[j-1] =  arr[j-1] + arr[j];
                    arr[j] = arr[j-1] - arr[j];
                    arr[j-1] = arr[j-1] - arr[j];
                }
            }
        }
    }

    public void recursiveSort(int[] arr, int n){
        if(n > 1){
            recursiveSort(arr, n-1);
            for(int i = n-1;i > 0;i--){
                if(arr[i] < arr[i-1]){
                    arr[i-1] = arr[i-1] + arr[i];
                    arr[i] = arr[i-1] - arr[i];
                    arr[i-1] = arr[i-1] -arr[i];
                }
            }
        }
    }
}
