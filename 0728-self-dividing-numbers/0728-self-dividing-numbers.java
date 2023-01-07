class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
         
            int temp=i;
            int counta=0;
            int countb=0;
            while(temp>0){
                counta++;
                int b=temp%10;
                if(b!=0 && i%b==0){
                    countb++;
                }
                temp=temp/10;
            }
            if(counta==countb){
                ls.add(i);
            }
        }
        return ls;
    }
}