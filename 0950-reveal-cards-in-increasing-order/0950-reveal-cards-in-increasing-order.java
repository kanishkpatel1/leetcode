class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
        int ans[]=new int[deck.length];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            dq.offer(i);
        }
        for(int i=0;i<deck.length;i++){
            ans[dq.poll()]=deck[i];
            dq.offer(dq.poll());
        }
        return ans;
    }
}