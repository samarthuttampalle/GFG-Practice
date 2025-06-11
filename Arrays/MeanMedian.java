class Solution {
    // Function to find median of the array elements.
    public int median(int A[], int N) {

        Arrays.sort(A);

        // Your code here
       
        if(N%2!=0){
            return A[(N-1)/2];
        }
        double res = (A[(N-1)/2] + A[N/2])/2;
        int result = (int)Math.floor(res);
        return result;
        // If median is fraction then conver it to integer and return
    }

    // Function to find median of the array elements.
    public int mean(int A[], int N) {
       int sol=0;
       for(int i=0;i<N;i++){
           sol = A[i]+sol;
       }
       return sol/N;
    }
}
