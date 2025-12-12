class Solution {
    // public boolean overlap(int[] int1,int[]int2){
    //      return (int1[1]>=int2[0] && int2[1]>=int1[0]);
    // }
    // public int[][] merge(int[][] intervals) {
    //     List<int[]> list=new ArrayList<>();
    //     for(int[] interval:intervals){
    //         list.add(interval);
    //     }
    //     boolean mergeHappened=true;
    //     while(mergeHappened){
    //     mergeHappened=false;
    //     for(int i=0;i<list.size();i++){
    //      int j=i+1;
    //      while(j<list.size()){
    //         int[] int1=list.get(i);
    //         int[] int2=list.get(j);
    //         if(overlap(int1,int2)){
    //             int1[0]=Math.min(int1[0],int2[0]);
    //             int1[1]=Math.max(int1[1],int2[1]);

    //             list.remove(j);
    //             mergeHappened=true;

    //         }
    //         else {
    //             j=j+1;
    //         }

    //      }
    //    }
    //  }
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] prev=list.get(list.size()-1);
            int[] curr=intervals[i];
            if(curr[0]<=prev[1] ){
                prev[0]=Math.min(curr[0],prev[0]);
                prev[1]=Math.max(curr[1],prev[1]);

            }
            else{
                list.add(intervals[i]);
            }
        }

       int[][]res=new int[list.size()][2];
       for(int i=0;i<list.size();i++){
        res[i]=list.get(i);
       }

        return res;
    }
}