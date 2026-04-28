class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);

        }

        while(pq.size()>1){
           int stone1=pq.remove();
           int stone2=pq.remove();
            if(stone1!=stone2){
                pq.add(stone1-stone2);
            }
        }
        if(pq.size()==0) return 0;
        return pq.peek();
        
    }
}