class Solution {
    public int mostBooked(int n, int[][] meetings) {
    Arrays.sort(meetings,(a,b)->a[0]-b[0]);

    long [] endTimeRoom=new long [n];// int to long because of wrong ans in case of large end time
    int[] counts=new int[n];

    for(int i=0;i<meetings.length;i++){
        int startTime=meetings[i][0];
        int endTime=meetings[i][1];

        int minTimeRoomIdx=0;
        boolean roomAllocated=false;

        for(int room=0;room<n;room++){
            if(startTime>= endTimeRoom[room]){
                 endTimeRoom[room]=endTime;
                 counts[room]++;
                 roomAllocated=true;
                 break;
            }
            if(endTimeRoom[room]<endTimeRoom[minTimeRoomIdx]){
                minTimeRoomIdx=room;
            }
        }

        if(!roomAllocated){
            endTimeRoom[minTimeRoomIdx]=endTimeRoom[minTimeRoomIdx]+endTime-startTime;
            counts[minTimeRoomIdx]++;

        }
    }

    int maxCountsIdx=0;
    for(int i=0;i<n;i++){
        if(counts[i]>counts[maxCountsIdx]){
            maxCountsIdx=i;
        }
    }

    return maxCountsIdx;


        
    }
}