class Solution {
       public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        
        Map<Integer,Integer>loosers=new HashMap<>(); // map to store loosers and count 
           // and for winner we store only 0 
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        for(int arr[]:matches){   // O(N)
            int looser=arr[1];
            int winner=arr[0];
            loosers.put(winner,loosers.getOrDefault(winner, 0)); // for winner we put only 0 to track it easily 
            loosers.put(looser,loosers.getOrDefault(looser, 0)+1);
            

        }
        for(Map.Entry<Integer,Integer> entry:loosers.entrySet()){   // O(NlogN)
            int key=entry.getKey();
            if(loosers.get(key)==0){
                ls1.add(key);
            }
            if(loosers.get(key)==1){
                ls2.add(key);
            }
        }
      Collections.sort(ls1);
      Collections.sort(ls2);
        res.add(ls1);
        res.add(ls2);
        return res;
        
    }
}
