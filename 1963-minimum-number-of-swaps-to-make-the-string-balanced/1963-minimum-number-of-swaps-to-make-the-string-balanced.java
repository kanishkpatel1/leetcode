// class Solution {
//     public int minSwaps(String s) {
//     int count=0;
//      Stack<Character> stk=new Stack<>();
//         for(Character ch:s.toCharArray()){
//             if(ch=='['){
//                 stk.push(ch);
//             }
//             else{
//                 if(!stk.empty() && ch==']'){
//                     stk.pop();
//                 }
//                 else{
//                     count++;
//                 }
//             }
//         }
//         return (count+1)/2;
//     }
// }

// without using stack
class Solution {
  
    public int minSwaps(String s) {
        int openbracket = 0, unbalanced = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '[')
                // increase the open bracket number 
                openbracket++;     
            else {
                // check if we have found an open bracket before
                if(openbracket > 0) {
                    // we have a proper pair
                    openbracket--; // so this pair can be ignored so reduce open 
                 } 
                // else we have got ']' and also no open brackets so increase the unbalanced closing bracket value.
                else unbalanced++;
            }
        }  
        // now total unbalanced is here, so even if open brackets increased in the stack, we have equal number of open and closed in the question.
		// so equal no of open brackets will be present, no need to add them in the unbalanced value.
        // so can directly apply the formula. this formula has been calculated through dry run.
        return (unbalanced+1)/2;
    }
}