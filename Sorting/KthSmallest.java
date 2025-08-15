public class KthSmallest {
    public int kthSmallest(int[] arr, int k) {
        // code here
        int n = arr.length;
        int l = 0, h = n-1;
        while(l<=h){
            int p = partition(arr,l,h);
            
            if(p==k-1){
                return arr[p];
            }
            else if(p>k-1){
                h = p-1;
            }
            else{
                l = p+1;
            }
        }
        return -1;
        
    }
    
    public int partition(int[] arr,int l, int h){
        int pivot = arr[h];
        int low = l-1;
        for(int i=l;i<h;i++){
            if(arr[i]<pivot){
                low++;
                swap(arr,i,low);
            }
        }
        swap(arr,low+1,h);
        return low+1;
    }
    
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
