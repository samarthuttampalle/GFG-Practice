public class AllocationOfMinPages {
    
//Back-end complete function Template for Java

    public static boolean isFeasible(int[] arr,int n,int k,int mid){
        int req = 1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                req++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        return (req<=k);
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int low  = max;
        int high = sum;
        int res = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}

