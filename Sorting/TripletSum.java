import java.util.Arrays;

public class TripletSum {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==target){
                    return true;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }
}
