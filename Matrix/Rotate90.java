public class Rotate90 {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
        
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            
            while(low<high){
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
        
    }
    public void swap(int[][] mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
