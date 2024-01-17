class Solution {
       public static int minSteps(String s, String t) {
        Map<Character,Integer>sf=new HashMap<>();
        Map<Character,Integer>tf=new HashMap<>();
        int ans=0;
        for(Character ch:s.toCharArray()){
            sf.put(ch,sf.getOrDefault(ch,0)+1);
        }
        for(Character ch:t.toCharArray()){
            tf.put(ch,tf.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: sf.entrySet()){
            if(tf.containsKey(entry.getKey())){
                int diff=sf.get(entry.getKey())-tf.get(entry.getKey());
                if(diff>0){
                    ans+=diff;
                }
            }
            else{
                ans+=sf.get(entry.getKey());
            }
        }
        // System.out.println(sf);
        // System.out.println(tf);
        return ans;
    }
   
}