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
                max=Math.max(sum,max);
                sum--;
            }
            
            else {
               max=Math.max(max,sum);

                }
            }
            return max;
    }
}