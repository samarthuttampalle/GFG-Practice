public class equilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int rs = 0;
        for(int i=0;i<n;i++){
            rs += arr[i];
        }
        int ls = 0;
        for(int i=0;i<n;i++){
            rs -= arr[i];
            if(ls==rs){
                return i;
            }
            ls += arr[i];
        }
        return -1;
    }
}
