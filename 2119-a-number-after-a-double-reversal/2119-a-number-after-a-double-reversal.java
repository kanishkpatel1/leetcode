class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=0;
      while(num>0){
          if(num%10==0){
            a++;
              num/=10;
              break;
          }
          else{
              num/=10;
              break;
              
          }
          
      }  
        if(a==0){
           return true; 
        }
        return false;
    }
}