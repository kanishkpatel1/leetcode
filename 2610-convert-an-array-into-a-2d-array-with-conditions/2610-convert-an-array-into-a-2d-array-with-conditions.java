class Solution {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> hs=new HashSet();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            hs.add(nums[i]);
        }
        while(map.size()!=0){
            List<Integer> ls=new ArrayList<>();
            for(int ele:hs){
                if(map.containsKey(ele)){
                    ls.add(ele);
                    if(map.get(ele)==1){
                        map.remove(ele);
                    }

                    else{
                        map.put(ele,map.get(ele)-1);
                    }
                }
            }
            res.add(ls);
        }
        return res;
    }
}