import java.util.Arrays;

public class Boxing {
    public void rearrange(int[] arr, int x) {
        int n = arr.length;
        
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxedArr, (a,b)-> {
            int diffA = Math.abs(a-x);
            int diffB = Math.abs(b-x);
            return diffA-diffB;
        });
        
        for(int i=0;i<n;i++){
            arr[i] = boxedArr[i];
        }
    }
}
