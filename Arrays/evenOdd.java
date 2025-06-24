public class evenOdd {
     public static int maxEvenOdd(int arr[], int n) {
        // your code here
        int curr = 1;
        int res = 1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res = Math.max(curr, res);
            }
            else{
                curr = 1;
            }
        }
        return res;
    }
    
}
