// Greedy Approch 

//A useful trick (when doing any parentheses validation) is to greedily check balance left-to-right, and then right-to-left.

// Left-to-right check ensures that we do not have orphan ')' parentheses.
// Right-to-left checks for orphan '(' parentheses.
class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0) return false;
        // left to right check 
         // check with the value of [locked(i)=='0']==>'('
        int open=0;
        int close=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || locked.charAt(i)=='0'){
                open++;
            }
            else{
                close++;
                if(close>open){
                    return false;
                }
            }
        }
        
        // right to left check.
        // check again with change the value of [locked(i)=='0']==>')'
        close=0;
        open=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')' || locked.charAt(i)=='0'){
                close++;
            }
            else{
                open++;
                if(open>close){
                    return false;
                }
            }
        }
        
        return true;
        
        
    }
}