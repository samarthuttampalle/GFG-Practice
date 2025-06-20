public class kadanesAlgo {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        
        for(int i=1;i<n;i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
