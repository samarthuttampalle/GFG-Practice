package Searching;

public class TernarySearch {
    public static int ternarySearch(int arr[],int l, int r, int x){
        int n = arr.length;
        while(r>=l){
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;
            if(arr[mid1]==x){
                return mid1;
            }
            if(arr[mid2]==x){
                return mid2;
            }
            if(arr[mid1]>x){
                r = mid1-1;
            }
            else if(arr[mid2]<x){
                l = mid2+1;
            }
            else{
                l = mid1+1;
                r = mid2-1;
            }
        }
        return -1;

    }
}
