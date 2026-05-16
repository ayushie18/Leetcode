class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->b[1]-a[1]);

        for(int key:map.keySet()){
            maxHeap.add(new int[]{key,map.get(key)});
        }

        int i=0;
        while(i<k){
          ans[i]=maxHeap.poll()[0];
          i++;
         
        }


        return ans;

        
    }
}