class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        int n=arr.length;
        
        int[] min=new int[n];
        min[0]=arr[0];
        for(int i=1;i<n;i++){
            min[i]=Math.min(arr[i],min[i-1]);
        }
        
        int[] max = new int[n];
        max[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            max[j]=Math.max(arr[j],max[j+1]);
        }
        int i=0;
        int j=0;
        int maxdiff=-1;
        while(i<n && j<n){
            if(n==1){
                maxdiff=0;
            }
            if(min[i]<=max[j]){
            maxdiff = Math.max(maxdiff,j-i);
            j++;
            }
            else{
                i++;
            }
        }
        return maxdiff;
        
    }
}