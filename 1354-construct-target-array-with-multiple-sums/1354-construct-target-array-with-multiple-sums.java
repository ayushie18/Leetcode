class Solution {
    public boolean isPossible(int[] target) {
        if(target.length==1) return target[0]==1;
        long sum=0;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:target){
            sum+=ele;
            maxHeap.add(ele);
        }
     while(true){
        int val=maxHeap.poll();
        if(val==1) return true;

        long rest=sum-val;
        int mod=(int)(val%rest);
        if(rest==1){
            return true;
        }

        if(mod==0 || mod==val){
            return false;
        }
        maxHeap.add(mod);
        sum=rest+mod;
     }   
        
    }
}