import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        int curr_ldr = arr[n-1];
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(curr_ldr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=curr_ldr){
                curr_ldr = arr[i];
                al.add(curr_ldr);
            }
        }
        Collections.reverse(al);
        return al;
        
        
    }
}

