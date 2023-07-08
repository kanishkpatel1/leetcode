class Solution {
       public static List<Integer> relocateMarbles(int[] arr, int[] moveFrom, int[] moveTo) {
Set<Integer> op = new HashSet<>();
        for (int el : arr) {
            op.add(el);
        }
        for (int lp = 0; lp < moveFrom.length; lp++) {
            if (op.contains(moveFrom[lp])) {
                op.remove(moveFrom[lp]);
                op.add(moveTo[lp]);
            }
        }
        List<Integer> ans = new ArrayList<>(op);
        Collections.sort(ans);
        return ans;
    }
}