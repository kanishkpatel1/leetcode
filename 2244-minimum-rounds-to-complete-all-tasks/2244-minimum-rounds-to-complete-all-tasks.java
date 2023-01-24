class Solution {
    public int minimumRounds(int[] tasks) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int x:tasks){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int res=0;
        for(int val: map.values()){
            if(val==1){
                return -1;
            }
            res+=(val+2)/3;
// this formula will return the res according to our question if we dont want to use it  we can use below lines code so comment above line and uncomment below 6 lines
            
            // for 3 ==1
                // 2=1
                // 4=2
                //5=2
                //6=2
                //7=3
            
            // else if(val%3==0){
            //     res+=(val/3);
            // }
            // else{
            //     res+=val/3+1;
            // }
        }
        return res;
    }
}