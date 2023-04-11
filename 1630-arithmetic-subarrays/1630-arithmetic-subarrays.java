class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ls=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int ind=0;
            int temp[]=new int[r[i]-l[i]+1];
            for(int j=l[i];j<=r[i];j++){
                temp[ind++]=nums[j];
            }
            ls.add(check(temp));
        }
        return ls;
    }
    
    
    public boolean check(int temp[]){
        Arrays.sort(temp);
        if(temp.length<=2){  // because diff of two element is only one so it's true and if there is only one ele in array temp then also it  is true
            return true;
        }
        int diff=temp[1]-temp[0];
        for(int i=1;i<temp.length;i++){
       if(diff!=temp[i]-temp[i-1]){
           return false;
            }
        }
        return true;
        
    }
}