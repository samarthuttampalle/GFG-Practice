import java.util.ArrayList;

public class Spiral {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        ArrayList<Integer> sol = new ArrayList<Integer>();
        
        int top=0,bottom=n-1,left=0,right=m-1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                sol.add(mat[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                sol.add(mat[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    sol.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    sol.add(mat[i][left]);
                }
                left++;
            }
        }
        return sol;
    }
}
