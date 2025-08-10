public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int m = partition(arr,low,high);
            
            quickSort(arr,low,m-1);
            quickSort(arr,m+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int p = arr[high];
        
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    
    private void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
