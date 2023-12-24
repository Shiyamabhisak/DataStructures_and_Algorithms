package sorting;

public class BubbleSort {
    public void iterativeSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            boolean flag = true;
            for(int j = 1;j<n-i;j++){
                if(arr[j] < arr[j-1]){
                    flag = false;
                    arr[j-1] = arr[j-1] + arr[j];
                    arr[j] = arr[j-1] - arr[j];
                    arr[j-1] = arr[j-1] - arr[j];
                }
            }
            if(flag) {
                break;
            }
        }
    }

    public void recursiveSort(int[] arr, int n){
        if(n>1){
            boolean flag = true;
            for(int i = 1;i<n;i++){
                if(arr[i] < arr[i-1]){
                    flag = false;
                    arr[i-1] = arr[i-1] + arr[i];
                    arr[i] = arr[i-1] - arr[i];
                    arr[i-1] = arr[i-1] - arr[i];
                }
            }
            if(flag)return;
            recursiveSort(arr, n-1);

        }
    }
}
