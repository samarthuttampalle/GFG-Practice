public class Count {
    public static String countSort(String s) {
        // code here
        int count[] = new int[26];
        
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder sorted = new StringBuilder();
        for(int i=0;i<26;i++){
            while(count[i]>0){
                sorted.append((char)(i+'a'));
                count[i]--;
            }
        }
        return sorted.toString();
    }
    
}
