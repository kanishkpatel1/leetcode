class Solution {
   public static  int distinctIntegers(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n>0){
            for(int i=1;i<n;i++){
                if(n%i==1){
                    hs.add(i);
                }
            }
            n--;
        }
        System.out.println(hs);
        return hs.size()+1;
    }
}