class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<int[]>minHeap=new PriorityQueue<>((a,b)->a[1]-b[1]);

        int i=0;
        int days=1;
        int count=0;
        while(i<events.length || !minHeap.isEmpty()){
            while(i<events.length && events[i][0]<=days){
              minHeap.add(events[i]);
              i++;
            }
            while(!minHeap.isEmpty() && minHeap.peek()[1]<days){
                minHeap.poll();
            }

            if(!minHeap.isEmpty()){
                minHeap.poll();
                count++;
                days++;

            }
            else{
                if(i<events.length){
                    days=events[i][0];
                }

            }

        }
        return count;


    }
}