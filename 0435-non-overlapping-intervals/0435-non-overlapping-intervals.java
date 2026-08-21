class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int count=0;
        int prevEnd=intervals[0][1];
        ArrayList<int[]>res=new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<prevEnd){
                count++;
                res.add(intervals[i]);
                prevEnd=Math.min(intervals[i][1],prevEnd);
            }
             else prevEnd=intervals[i][1];
        }
        for(int[] arr:res){
            System.out.print(Arrays.toString(arr));
        }
        return count;
        
    }
}