// import java.math.BigInteger;
// class Solution {
//     public String addBinary(String a, String b) {
//         // approach 1 BIGINTEGER
  
//         BigInteger b1=new BigInteger(a,2);
//         BigInteger b2=new BigInteger(b,2);
//           String sum=b1.add(b2).toString(2);
//          return sum;
        
//         // or we can do all of above stuff in one line only
//        //  return new BigInteger(a,2).add(new BigInteger(b,2)).toString(2);
//     }
// }

class Solution {
    public String addBinary(String a, String b) { 
        
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
             sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
            
        }
        if(carry !=0){
            sb.append(carry);
        }
        String str=sb.reverse().toString();
        return str;
    }
}