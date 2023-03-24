class Solution {
    public boolean checkRecord(String s) {
        char [] ch=s.toCharArray();
        int lcount=0,acount=0;
        // lcount to keep keep track the late and acount to keep track the absenties
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='L'){
                lcount++;
                if(lcount==3){
                    return false;
                }
                
            }
            else if(ch[i]=='A'){
                lcount=0;
                acount++;
                if(acount>=2){
                    return false;
                }
            }
            else{
                lcount=0;
            }
        }
        return true;
    }
}