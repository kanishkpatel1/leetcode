class Solution {
    public int countOdds(int low, int high) {
       //  if(high-low==1){
       //      return 1;
       //  }
       //  if(low%2!=0){
       // return (high+1-low)/2+1;}
       //  else {
       //      return (high+1-low)/2;
        if(high%2!=0 && low%2!=0){
                return ((high-low)+1)/2+1;
        }
        else if(high%2==0 && low%2==0){
            return (high-low)/2;
        }
        else  {
           // System.out.println("KK");
            return ((high-low)+1)/2;
            
            }
}
}
           
