import java.util.ArrayList;
import java.util.List;

public class printPattern {
        public void generatePattern(int curr,int N,List<Integer> al){
        al.add(curr);
        
        if(curr<=0){
            return;
        }
        
        generatePattern(curr-5,N,al);
        
        al.add(curr);
    }
    
    public List<Integer> pattern(int N) {
        // code here
        List<Integer> al = new ArrayList<Integer>();
        generatePattern(N,N,al);
        return al;
    }
}
