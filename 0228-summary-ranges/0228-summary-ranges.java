class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls=new ArrayList<>();
        String str="";
        if(nums.length==1){
            str+=nums[0];
            ls.add(str);
            return ls;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                System.out.println(nums[i]);
                 str+=nums[i-1];
                ls.add(str);
                
            }
            else{
               int a=nums[i-1];
                while(i<nums.length && nums[i-1]+1==nums[i]) {
                     System.out.println(nums[i]);
                    i++;
                }
                str+=a+"->"+nums[i-1];
                ls.add(str);
            }
            
            str="";
        }
        if(nums.length>=2 && (nums[nums.length-1]!=nums[nums.length-2]+1)){
            String abc="";
                abc+=nums[nums.length-1];
            ls.add(abc);
        }
        return ls;
    }
}