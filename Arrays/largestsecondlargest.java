lass Solution {

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray,
                                                             int arr[]) {
        int res=-1, largest=0;
        for(int i=1;i<sizeOfArray;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(arr[largest]);
        al.add(res==-1 ? -1 : arr[res]);
        return al;
    }
}