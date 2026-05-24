class Pair{
    int num;
    int freq;
      public Pair(int n,int f){
        this.num=n;
        this.freq=f;
      }


}
 class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<Pair>minHeap=new PriorityQueue<>((a,b)->
        {
            if(a.freq==b.freq){
                return b.num-a.num;
            }
            return a.freq-b.freq;
            }
        );

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
           minHeap.add(new Pair(key,map.get(key)));
        }

        int[] ans=new int[nums.length];
        int i=0;
        while(!minHeap.isEmpty()){
            Pair curr=minHeap.poll();
            int val=curr.num;
            ans[i]=val;
            int f=curr.freq-1;
            if(f>0){
             minHeap.add(new Pair(curr.num,f));
            }
            i++;
        }
        return ans;

        
    }
}