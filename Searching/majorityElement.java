package Searching;

public class majorityElement {
    int majorityElement(int arr[]) {
        int res = 0,count = 1;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                res=i;
            }
        }
        count = 0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=n/2){
            return -1;
        }
        return arr[res];
    }
}
