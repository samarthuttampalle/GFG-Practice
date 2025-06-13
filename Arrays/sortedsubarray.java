class Solution {

    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num) {

       if(arr[num-1]<arr[0]){
           int pivotalPoint=0;
           for(int i=0;i<num-1;i++){
               if(arr[i+1]<arr[i]){
                   pivotalPoint++;
               }
           }
           if(pivotalPoint==1){
               return true;
           }
       }
       else if(arr[num-1]>arr[0]){
           int pivotalPoint=0;
           for(int i=0;i<num-1;i++){
               if(arr[i+1]>arr[i]){
                   pivotalPoint++;
               }
           }
           if(pivotalPoint==1){
               return true;
           }
       }
       return false;
        
    }
}
