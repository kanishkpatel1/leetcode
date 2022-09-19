class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
      for(int i=0;i<s.length();i++){
          int c=s.charAt(i)-96;
          while(c>0){
                sum = sum + c%10;
                c = c/10;
            }
           }
        while(k>1){
           int rev=0;
            while(sum>0){
                rev+=sum%10;
                sum/=10;
            }
            sum=rev;
            k--;
        }
        return sum;
    }
}