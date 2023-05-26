class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
         permback(res,nums,new ArrayList(),flag);
        return res;
    }
    void permback(List<List<Integer>> res,int[] nums,List<Integer> ans,boolean[] flag){
        if(ans.size()==nums.length && !res.contains(ans)){ // only this line will be changed due to similar number generated 
            // because of two 1 1 there two permutations will be same so we will have to remove it 
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i]==true){
                continue;
            }
            ans.add(nums[i]);
            flag[i]=true;
            permback(res,nums,ans,flag);
            ans.remove(ans.size()-1);
            flag[i]=false;
        }
    }
}