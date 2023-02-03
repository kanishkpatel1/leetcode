class Solution {
    public int maxDepth(String s) {
          int sum=0;
      int max=0;
        char []ch=s.toCharArray();
      
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' ){
                sum++;
            }
            else if(ch[i]==')'){
                max=Math.max(sum,max);  // this is when there is not any chars between the braces 
                //"(1())"  op-> 2
                //"()" op-> 1
                sum--;
            }
            
            else {
               max=Math.max(max,sum);

                }
            }
            return max;
    }
}