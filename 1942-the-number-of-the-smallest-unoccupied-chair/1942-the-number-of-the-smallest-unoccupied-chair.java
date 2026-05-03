class Solution {
    public int smallestChair(int[][] times, int targetFriend) {

        int targetFrdAT=times[targetFriend][0];

        Arrays.sort(times,(a,b)->(a[0]-b[0]));

        PriorityQueue<Integer> availableChairs=new PriorityQueue<>();
        PriorityQueue<int[]> occupiedChairs=new PriorityQueue<>((a,b)->(a[0]-b[0]));

        for(int i=0;i<times.length;i++){
            availableChairs.add(i);
        }

        for(int i=0;i<times.length;i++){
             int aT=times[i][0];

             while(!occupiedChairs.isEmpty()){
                if(aT>=occupiedChairs.peek()[0]){
                    int[] chair=occupiedChairs.poll();
                    availableChairs.add(chair[1]);
                }
                else{
                    break;
                }

             } 

             int c=availableChairs.poll();
             if(targetFrdAT==aT){
                 return c;
             }

            occupiedChairs.add(new int[]{
                times[i][1],c
            });    

        }

        return -1;
        
   }
}