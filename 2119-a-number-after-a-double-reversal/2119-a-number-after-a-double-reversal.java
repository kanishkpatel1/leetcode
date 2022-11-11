class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=0;
      while(num>0){
          if(num%10==0){
              return false;
            // a++;
            //   num/=10;
            //   break;
          }
          else{
              return true;
              } }  
        // if(a==0){
        //    return true; 
        // }
        return true;
    }
}