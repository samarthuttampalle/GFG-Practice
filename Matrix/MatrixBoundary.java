import java.util.ArrayList;

public class MatrixBoundary {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        if(m==1){
            for(int i=0;i<n;i++){
                res.add(mat[0][i]);
            }
        }
        else if(n==1){
            for(int i=0;i<n;i++){
                res.add(mat[i][0]);
            }
        }
        else{
            for(int i=0;i<n;i++){
                res.add(mat[0][i]);
            }
            for(int i=1;i<m;i++){
                res.add(mat[i][n-1]);
            }
            for(int i=n-2;i>=0;i--){
                res.add(mat[m-1][i]);
            }
            for(int i=m-2;i>=1;i--){
                res.add(mat[i][0]);
            }
        }
        return res;
    }
}
