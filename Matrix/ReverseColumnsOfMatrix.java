public class ReverseColumnsOfMatrix {
     static void reverseCol(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<n;i++){
            int j=0,k=m-1;
            while(j<k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
