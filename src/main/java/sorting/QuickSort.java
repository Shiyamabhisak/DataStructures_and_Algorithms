package sorting;

public class QuickSort {
    public void sort(int[] arr,int startIndex, int endIndex){
        if(startIndex<endIndex){
            int pivot = getPivotHelper(arr,startIndex,endIndex);
            sort(arr,startIndex,pivot-1);
            sort(arr,pivot+1,endIndex);
        }
    }

    public int getPivotHelper(int[] arr,int startIndex,int endIndex){
        int pivot = arr[startIndex];
        int i = startIndex, j = endIndex;
        while(i < j){
            while(arr[i] <= pivot && i < endIndex){
                i++;
            }
            while(arr[j] > pivot && j > startIndex){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[startIndex];
        arr[startIndex] = temp;
        return j;
    }
}
