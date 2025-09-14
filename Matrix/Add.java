public class Add {
     static int[][] sumMatrix(int A[][], int B[][]) {
        // code here
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        
        if(n1!=n2 || m1!=m2){
            return new int[0][0];
        }

        int[][] res = new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                res[i][j] = A[i][j]+B[i][j];
            }
        }
        return res;
    }
}
