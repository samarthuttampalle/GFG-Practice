public class ExchangeOfMatrixRows {
     static void interchangeRows(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<m;i++){
            int j=0,k=n-1;
            while(j<k){
                int temp = mat[j][i];
                mat[j][i] = mat[k][i];
                mat[k][i] = temp;
                j++;
                k--;
            }
        }
    }
    
}
