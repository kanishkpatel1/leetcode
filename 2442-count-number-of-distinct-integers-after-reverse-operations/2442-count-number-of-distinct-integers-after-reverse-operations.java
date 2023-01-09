class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet();  
        
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int sum=0;
            while(a>0){
                sum*=10;
                sum+=a%10;
                a/=10;
            }
            set.add(nums[i]);
            set.add(sum);
        }
        return set.size();
    }
}