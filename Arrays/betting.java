public class betting {
    static int betBalance(String s) {
        // code here
        int n = s.length();
        int balance = 4;
        int bet = 1;
        for(int i=0;i<n;i++){
            if(balance<bet){
                return -1;
            }
            else if(s.charAt(i)=='W'){
                balance += bet;
                bet = 1;
            }
            else if(s.charAt(i)=='L'){
                balance -= bet;
                bet *= 2;
            }
        }
        return balance;
    }
}
