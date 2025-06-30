public class maxOccuredInteger {
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] freq = new int[maxx+2];
        for(int i=0;i<n;i++){
            freq[l[i]]++;
            freq[r[i]+1]--;
        }
        int res = 0;
        for(int i=1;i<=maxx;i++){
            freq[i] = freq[i]+freq[i-1];
            if(freq[i]>freq[res]){
                res = i;
            }
        }
        return res;
        
        
    }
}
