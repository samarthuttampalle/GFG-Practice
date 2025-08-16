public class SortBinary {
    public void binSort(int[] arr) {
        // code here
        int n = arr.length;
        int i=-1,j=n;
        while(true){
            do{
                i++;
            } while(i<n && arr[i]==0);
            
            do{
                j--;
            } while(j>=0 && arr[j]==1);
            
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }
    
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
