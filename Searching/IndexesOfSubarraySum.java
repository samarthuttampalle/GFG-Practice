import java.util.ArrayList;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int low = 0;
        int high = 0;
        int curr = 0;
        while(high<=n){
            if(curr == target){
                ans.add(low+1);
                ans.add(high);
                return ans;
            }
            else if(curr<target){
                if(high<n){
                    curr += arr[high];
                    high++;
                }
                else{
                    break;
                }
            }
            else{
                curr -= arr[low];
                low++;
            }
        }
        ans.add(-1);
        return ans;
    }
    
}
