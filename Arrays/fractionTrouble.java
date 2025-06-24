public class fractionTrouble {
    public int[] LargestFraction(int n, int d) {
        // code here
        int bestNum = 0;
        int bestDen = 1;
        for(int i=10000;i>=2;i--){
            int num = (n*i-1)/d;
            
            if(num*bestDen >= bestNum*i){
                bestNum = num;
                bestDen = i;
            }
        }
            
            int D = gcd(bestNum,bestDen);
            int[] res = new int[2];
            res[0] = (bestNum/D);
            res[1] = (bestDen/D);
            
        return res;
        
    }
    public int gcd(int a, int b){
        while(b>0){
        int temp = b;
        b = a%b;
        a = temp;
        }
        return a;
    }
    
}
