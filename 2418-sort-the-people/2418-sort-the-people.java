class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int a=0;
        String []str=new String[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            str[a++]=map.get(heights[i]);
        }
        return str;
    }
}