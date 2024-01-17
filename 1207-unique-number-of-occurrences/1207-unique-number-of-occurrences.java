class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer> map=new HashMap<>();
        
        for(int el:arr){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        Set<Integer> occ=new HashSet<>();
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
          int val= entry.getValue();
          if(!occ.add(val))  {
              return false;
          }
          
        }
        return true;
    }
}