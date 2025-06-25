public class strongestNeighbour {
    static void maximumAdjacent(int n, int arr[]) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n-1;i++){
            sb.append(Math.max(arr[i],arr[i+1])).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
