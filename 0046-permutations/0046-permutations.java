class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
         permback(res,nums,new ArrayList(),flag);
        return res;
    }
    void permback(List<List<Integer>> res,int[] nums,List<Integer> ans,boolean[] flag){
        if(ans.size()==nums.length){
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