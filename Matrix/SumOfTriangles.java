import java.util.ArrayList;

public class SumOfTriangles {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        int n = mat.length;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum1 += mat[i][j];
                sum2 += mat[j][i];
            }
        }
        sol.add(sum1);
        sol.add(sum2);
        return sol;
    }
}
