class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        if(k>=n){
            int low=0,high=n-1;
            while(low<high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        else{
            for(int i=0;i<n;i+=k){
                int low = i;
                int high = Math.min(i+k-1,n-1);
                while(low<high){
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                }
            }
        }
        
    }
}
