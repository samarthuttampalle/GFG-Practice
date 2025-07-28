import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = arr1.length;
        int m = arr2.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                al.add(arr1[i]);
                i++;
                j++;
            }
        }
        return al;
    }
}
