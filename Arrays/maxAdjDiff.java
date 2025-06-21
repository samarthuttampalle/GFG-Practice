public class maxAdjDiff {
    public static int minAdjDiff(int arr[], int n) {

        int res = Math.abs(arr[0] - arr[1]);
        
        for(int i=0;i<n-1;i++){
            int curr = Math.abs(arr[i] - arr[i+1]);
            res = Math.min(curr, res);
        }
        int circular = Math.abs(arr[n-1] - arr[0]);
        res = Math.min(res, circular);
        
        return res;
    }
}
