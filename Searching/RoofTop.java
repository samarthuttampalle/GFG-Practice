public class RoofTop {
     public int maxStep(int arr[]) {
        // Your code here
        int n = arr.length;
        int ans=0,count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
    
}
