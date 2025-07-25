public class minElementInRotatedSorted {
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        while(low<high){
            if(arr[low]<arr[high]){
                return arr[low];
            }
            
            int mid = (low+high)/2;
            
            if(arr[mid]>arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }
}
