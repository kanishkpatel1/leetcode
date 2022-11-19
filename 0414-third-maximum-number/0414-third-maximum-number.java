class Solution {
  public int thirdMax(int[] l) {
        HashSet<Integer> hs=new HashSet<Integer>();
     
        for(int i=0;i<l.length;i++){
            hs.add(l[i]);
        }
      List<Integer> ls=new ArrayList<>(hs);
     Collections.sort(ls);
      if(ls.size()<3){
          return ls.get(ls.size()-1);
      }
      return ls.get(ls.size()-3);
  }
}