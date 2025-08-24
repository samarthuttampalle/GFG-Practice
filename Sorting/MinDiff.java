public class MinDiff {
    public int MinimumDifference(int[] arr) {
        // code here
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=1;i<n;i++){
            res = Math.min(res, Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
}

