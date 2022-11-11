class Solution {
    public boolean isSameAfterReversals(int num) {
      while(num>0){
          if(num%10==0){  
              // if we get any Zero in last then then number will not same 
              return false;
          }
          else{
              // if we did not find any zero in the last when we will get same after rev
              return true;
              } }  
        return true;
    }
}