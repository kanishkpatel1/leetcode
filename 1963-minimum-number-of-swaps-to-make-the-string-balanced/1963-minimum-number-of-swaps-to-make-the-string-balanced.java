class Solution {
    public int minSwaps(String s) {
    int count=0;
     Stack<Character> stk=new Stack<>();
        for(Character ch:s.toCharArray()){
            if(ch=='['){
                stk.push(ch);
            }
            else{
                if(!stk.empty() && ch==']'){
                    stk.pop();
                }
                else{
                    count++;
                }
            }
        }
        return (count+1)/2;
    }
}