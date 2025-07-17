public class CountRepeated {
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    public static int first(long arr[], long key){
        int low = 0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
    public static int last(long arr[], long key){
        int low=0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                res = mid;
                low = mid+1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
    public static Pair findRepeating(long arr[], int n) {
        int low = 0;
        int high = n-1;
        long repeat = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[0]+mid){
               
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low>=n || low<0 || arr[low]!=arr[low-1]){
            return new Pair(-1,-1);
        }
        repeat  = arr[low];
        int f = first(arr, repeat);
        int l = last(arr, repeat);
        int count = l-f+1;
        return new Pair(repeat,count);
    
       
    }
    
};
