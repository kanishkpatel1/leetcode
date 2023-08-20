class Solution {
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
        Collections.sort(offers, (a, b) -> a.get(1).compareTo(b.get(1)));

        int[] arr = new int[n];
        int oI= 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (i > 0) ? arr[i - 1] : 0; 
            
            while (oI < offers.size() && offers.get(oI).get(1) == i) {
                int start = offers.get(oI).get(0);
                int gold = offers.get(oI).get(2);
                arr[i] = Math.max(arr[i], (start > 0 ? arr[start - 1] : 0) + gold);
                oI++;
            }
        }

        return arr[n - 1];
    }
}