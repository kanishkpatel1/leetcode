class Solution {
    public int[] getAverages(int[] nums, int k) {
        int res[]=new int[nums.length];
        
        
        if(k==0){
            return nums;
        }
        if(2*k+1>nums.length){
            for(int i=0;i<nums.length;i++){
                res[i]=-1;
            }
            return res;
        }
        int count=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-k){
                while(i<nums.length){
                    res[i]=-1;
                    i++;
                }
                return res;
            }
            while(i<k){
                sum+=nums[i];
               // System.out.println(nums[i]);
                res[i]=-1;
                i++;
            }
            if(i==k){
                int a=i;
            while(a<=2*k){
              sum+=nums[a];
                //System.out.println(nums[a]);
                a++;
            }
               long ans=sum/(2*k+1);
                res[i]=(int)ans;
                continue;
            }
            
            
                sum-=nums[i-k-1];
                sum+=nums[i+k];
                long ans=sum/(2*k+1);
                res[i]=(int)ans;
        }
            
            
        
        return res;
    } 
    
}