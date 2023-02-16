class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         int a=0;
        int carry=0;
        List<Integer> ls=new ArrayList<>();
        
        for(int i=num.length-1;i>=0;i--){
            if(k>0){
                a=carry+k%10+num[i];
                carry=a/10;
                ls.add(a%10);
                k/=10;
            }
            else{
                a=num[i]+carry;
                ls.add(a%10);
                carry=a/10;
            }
            a=0;
            
        }
      
   while(k>0){
       a=k%10+carry;
       carry=a/10;
    ls.add(a%10);
      
       k/=10;
   }
          if(carry!=0){
            ls.add(carry);
        }
        
         Collections.reverse(ls);
        return ls;
        }
}