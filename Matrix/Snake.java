import java.util.ArrayList;

public class Snake {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    res.add(matrix[i][j]);
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}
