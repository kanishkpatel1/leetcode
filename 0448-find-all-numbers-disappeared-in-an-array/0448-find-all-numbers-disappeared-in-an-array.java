class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int indx=Math.abs(nums[i])-1;
            if(nums[indx]>0){
               nums[indx]=nums[indx]*-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ls.add(i+1);
            }
        }
        return ls;
    }
}