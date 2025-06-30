import java.util.ArrayList;
import java.util.List;

public class frequncyInLimitedArray {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        
        for(int num:arr){
            if(num>=0 && num<=n){
                freq[num-1]++;
            }
        }
        
        List<Integer> result = new ArrayList<Integer>();
        for(int count:freq){
            result.add(count);
        }
        return result;
        
    }
}
