class Solution {
      public static String destCity(List<List<String>> paths) {
      List<String> ls=new ArrayList<>();
      for(List<String> str:paths){
        ls.add(str.get(0));
      }
      for(List<String> str:paths){
        if(!ls.contains(str.get(1))){
            return str.get(1);
      }
    }
    return "";
}
}