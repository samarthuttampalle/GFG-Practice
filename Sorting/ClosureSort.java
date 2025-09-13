public class ClosureSort {
    int closer(int[] arr, int x) {
        int n = arr.length;
        int low=0,high=n-1;
        
        while(low<high){
            int mid = (low+high)/2;
            
            if(arr[mid]==x){
                return mid;
            }
            if(mid-1>=low && arr[mid-1]==x){
                return mid-1;
            }
            if(mid+1<=high && arr[mid+1]==x){
                return mid+1;
            }
            if(arr[mid]<x){
                low = low+2;
            }
            else{
                high = high-2;
            }
        }
        return -1;
    }
}
