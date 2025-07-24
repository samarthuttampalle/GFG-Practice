import java.util.ArrayList;

public class MergeThreeSortedArray {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(a[i]<=b[j] && a[i]<=c[k]){
                al.add(a[i]);
                i++;
            }
            else if(b[j]<=a[i] && b[j]<=c[k]){
                al.add(b[j]);
                j++;
            }
            else{
                al.add(c[k]);
                k++;
            }
        }
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                al.add(a[i]);
                i++;
            }
            else{
                al.add(b[j]);
                j++;
            }
        }
        while(i<n1 && k<n3){
            if(a[i]<=c[k]){
                al.add(a[i]);
                i++;
            }
            else{
                al.add(c[k]);
                k++;
            }
        }
        while(j<n2 && k<n3){
            if(b[j]<=c[k]){
                al.add(b[j++]);
            }
            else{
                al.add(c[k++]);
            }
        }
        while(i<n1){
            al.add(a[i]);
            i++;
        }
        while(j<n2){
            al.add(b[j]);
            j++;
        }
        while(k<n3){
            al.add(c[k]);
            k++;
        }
        return al;
    }
    
}
