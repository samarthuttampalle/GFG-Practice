public class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int n = arr.length;
        int end = n-1;
        int i = 0;
        int start = 0;
        while(i<=end){
            if(arr[i]<a){
                swap(arr,i,start);
                start++;
                i++;
            }
            else if(arr[i]>b){
                swap(arr,i,end);
                end--;
            }
            else{
                i++;
            }
        }
       
    }
    
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
