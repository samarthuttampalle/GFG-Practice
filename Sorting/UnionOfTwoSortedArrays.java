import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                al.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                al.add(b[j]);
                j++;
            }
            else{
                al.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i==0 || a[i]!=a[i-1]){
                al.add(a[i]);
            }
            i++;
        }
        while(j<m){
            if(j==0 || b[j]!=b[j-1]){
                al.add(b[j]);
            }
            j++;
        }
        return al;
    }
}
