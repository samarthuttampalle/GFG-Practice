package Searching;

public class floorInSortedArray {
    static int findFloor(int[] arr, int x) {
        // write code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==x){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]<x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
