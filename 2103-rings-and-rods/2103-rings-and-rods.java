class Solution {
    public int countPoints(String rings) {
               boolean red[]=new boolean[10];
        boolean green[]=new boolean[10];
        boolean blue[]=new boolean[10];
        int n=rings.length();
        for(int i=0;i<n;i+=2){
            int a=rings.charAt(i+1)-'0';  //convert to int--> for find index (colours boolean array)
            if(rings.charAt(i)=='R'){
                red[a]=true;
                // make true of colour array(red) at particular  
                //index (colour come along with )
            }
            else if(rings.charAt(i)=='G'){
                green[a]=true;
            }
            else if(rings.charAt(i)=='B'){
                blue[a]=true;
            }
        }
        int sum=0;
        for(int i=0;i<10;i++){
            if(red[i]&&blue[i]&&green[i]){  
                // check if the both colour true then increase the counter
                sum++;
            }
        }
        return sum;
    }
}