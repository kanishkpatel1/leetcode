class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==1 && nums[0]==1){
            return 2;
        }
        else if(nums.length==1){
            return 1;
        }
        HashSet<Integer> hs=new HashSet<>();
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
          else  if(nums[i]<0){
                continue;
            }
            else{
            hs.add(nums[i]);    
            }
        }
        
        List<Integer> ls = new ArrayList<Integer>(hs);
        if(ls.size()==0){
            return 1;
        }
        
          else if(ls.size()==1 && ls.get(0)==1){
            return 2;
        }
        else if(ls.size()==1){
            return 1;
        }
        System.out.println(ls);
         int res[]=new int[ls.size()];
        for(int i=0;i<hs.size();i++){
            res[i]=ls.get(i);
        }
        Arrays.sort(res);
        int i;
        for(i=1;i<res.length+1;i++){
          if(res[i-1]!=i){
              return i;
          }
        }
        return i;
    }
}