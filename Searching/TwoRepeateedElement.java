public class TwoRepeateedElement {
     public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        int idx = 0;
        int[] res = new int[2];
        
        for(int i=0;i<n+2;i++){
            int val = Math.abs(arr[i]);
            if(arr[val]>0){
                arr[val] = -arr[val];
            }
            else{
                res[idx++] = val;
                if(idx==2) break;
            }
        }
        return res;
    }
}
