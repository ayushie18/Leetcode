class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->{
              int diff1=Math.abs(a-x);
              int diff2=Math.abs(b-x);

              if(diff1==diff2){
                return b-a;
              }
              return diff2-diff1;
           });

        for(int ele:arr){
            maxHeap.add(ele);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();
        while(!maxHeap.isEmpty()){
            ans.add(maxHeap.poll());
        }  

        Collections.sort(ans); 

        return ans;


    }
}