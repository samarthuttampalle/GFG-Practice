import java.util.ArrayList;

public class Transpose {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n = mat.length;
        
        ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                row.add(mat[i][j]);
            }
            sol.add(row);
        }
        return sol;
        
    }
    
    public void swap(int[][] mat, int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
