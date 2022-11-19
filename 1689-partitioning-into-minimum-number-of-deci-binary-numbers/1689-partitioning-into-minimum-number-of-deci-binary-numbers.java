// in the code we just find the max digit in the string and return that because 
// the number which is max that is the counter time we'll have to add 1 for ex
// let us consider an example ----> input=
//     "458"          "45"
//     111             11
//     111             11            
//     111             11 
//     111             11   
//     011           + 01
//     001         -------                
//     001            =45      so we'll have to add it 5 times 
//   + 001
//  ----------
//    =458      so we will have to add 8 times to add in min steps 
    


class Solution {
    public int minPartitions(String n) {
        int maxdigit =0;
      for(int i =0;i<n.length();i++)
      {
          maxdigit = Math.max(maxdigit,Integer.valueOf(n.charAt(i)-'0'));
      }
        return maxdigit;
    }
}