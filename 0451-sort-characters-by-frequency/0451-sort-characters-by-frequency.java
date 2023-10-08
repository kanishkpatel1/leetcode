public class Solution{
public  static String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        //System.out.println(map);
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.remove();
            int len=map.get(ch);
            while(len-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}