package Searching;

public class LeftIndex {
    static int leftIndex(int N, int arr[], int X) {

        // Your code here
        int low = 0;
        int high = N-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(arr[mid]>X){
                high = mid-1;
            }
            else if(arr[mid]<X){
                low = mid+1;
            }
            else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
