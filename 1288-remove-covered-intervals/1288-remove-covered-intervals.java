class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       
        Arrays.sort(intervals,(a,b)->{
          if(a[0]-b[0]==0){
            return b[1]-a[1];
          }
          return a[0]-b[0];
        }
          );

        int count=0;
        int maxEnd=-1;
        for(int i=0;i<intervals.length;i++){
          if(intervals[i][1]<=maxEnd){
            count++;
          }
          else{
            maxEnd=intervals[i][1];
          }
        }

      return intervals.length-count;
        
    }
}