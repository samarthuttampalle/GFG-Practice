public class waveArray 
{
    public static void convertToWave(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=1;i<n;i+=2){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
    }
    
}
