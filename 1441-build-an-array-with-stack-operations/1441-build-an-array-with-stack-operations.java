class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ls=new ArrayList<>();
        int curr=1;
        int i=0;
        while(i<target.length){
            ls.add("Push");
            
             if(target[i]!=curr){
                 ls.add("Pop");
             }
            else if(target[i]==curr){
                i++;  // increase i only when the value matched with the array target[i] with current value else 
            }
            curr++;
        }
       return ls; 
    }
}