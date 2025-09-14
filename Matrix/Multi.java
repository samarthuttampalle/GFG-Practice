public class Multi {
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        // code here
        int n1 = mat1.length;
        int m1 = mat1[0].length;
        int n2 = mat2.length;
        int m2 = mat2[0].length;
        
        if(m1!=n2){
            return false;
        }
        int[][] sol = new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                for(int k=0;k<m1;k++){
                    sol[i][j] += mat1[i][k]*mat2[k][j]; 
                }
            }
        }
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                if(result[i][j]!=sol[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
