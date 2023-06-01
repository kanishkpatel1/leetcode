class Solution {
    public String minRemoveToMakeValid(String s) {
     char []ch=s.toCharArray();
      
    StringBuilder sb=new StringBuilder();
    int count=0;
    
        
  // left to right )---> (
    for(int i=0;i<ch.length;i++){
                if(ch[i]=='('){
            count++;
        }
        else if(ch[i]==')'){
            if(count>0){
                count--;
            }
        
        else{
            
            ch[i]='0'; // store zero in place of invalid bracket 
        }
        }
    }
        
    count=0;  // again make count zero for right to left 
        // right to left (-------> )
    for(int i=ch.length-1;i>=0;i--){
        if(ch[i]==')'){
            count++;
        }
        else if(ch[i]=='('){
            if(count>0){
                count--;
            }
        
        else{
            
            ch[i]='0'; // store zero in place of invalid bracket 
        }
        }
    }
 for(int i=0;i<ch.length;i++){
     if(ch[i]!='0'){
         sb.append(ch[i]);
     }
 }
        return sb.toString();
    }
}