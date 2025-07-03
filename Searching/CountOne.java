package Searching;

public class CountOne {
    public static int countOnes(int arr[], int N) {

       int low=0;
       int high = N-1;
       while(high>=low){
           int mid = (low+high)/2;
           if(arr[mid]==0){
               high = mid-1;
           }
           else{
               if(mid==N-1 || arr[mid+1]==0){
                   return mid+1;
               }
               else{
                   low = mid+1;
               }
           }
       }
       return 0;
        
    }
}
