package GFG-Practice;

public class Phone {
    class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
       String[] Keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       
       ArrayList<String> result = new ArrayList<>();
       if(arr==null||arr.length==0) return result;
       backtrack(arr,0,new StringBuilder(),result,Keypad);
       return result;
    }
    private void backtrack(int[] arr, int index,StringBuilder current, ArrayList<String> result,String[] Keypad){
        if(index == arr.length){
            result.add(current.toString());
            return;
        }
        String letters = Keypad[arr[index]];
        for(char c: letters.toCharArray()){
            current.append(c);
            backtrack(arr,index+1,current,result,Keypad);
            current.deleteCharAt(current.length()-1);
            
        }
        
    }
}
    
}
