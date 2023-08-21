class Solution {
    
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return (count==1);
    }
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        boolean prime=checkPrime(len);
        String st="";
        String pt="";
        boolean check=false;
        for(int i=0;i<s.length()-1;i++){
            pt+=s.charAt(i);
           // System.out.println(pt);
            st+=pt;
            for(int j=1;j<s.length()/(i+1);j++){
                // System.out.println(i+1);
                st+=pt;
                
            }
            if(i==1){
                if(check==false && prime==true){
                    return false;
                }
            }
          //  System.out.println(st);
            if(st.equals(s)){
                
                // System.out.println(st);
                check=true;
                break;
            }
            
           st="";     

        }
        return check;
    }
}