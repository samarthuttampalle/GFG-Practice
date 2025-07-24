public class MergeWithoutExtraSpace {
    private int nextGap(int gap){
        if(gap<=1) return 0;
        return (gap/2)+(gap%2);
    }
    public void mergeArrays(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int gap = nextGap(n1+n2);
        
        while(gap>0){
            int i=0,j=0;
            for(i=0;i+gap<n1;i++){
                if(a[i]>a[i+gap]){
                    int temp = a[i];
                    a[i] = a[i+gap];
                    a[i+gap] = temp;
                }
            }
            for(j=gap>n1?gap-n1:0;i<n1 && j<n2;i++,j++){
                if(a[i]>b[j]){
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
            }
            if(j<n2){
                for(j=0;j+gap<n2;j++){
                    if(b[j]>b[j+gap]){
                       int temp = b[j];
                       b[j] = b[j+gap];
                       b[j+gap] = temp;
                    }
                }
            }
            gap = nextGap(gap);
        }
        
    }
    
}
