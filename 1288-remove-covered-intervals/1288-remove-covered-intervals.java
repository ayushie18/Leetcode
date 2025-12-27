class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
      
        for(int i=0;i<intervals.length;i++){
            int a=intervals[i][0];
            int b=intervals[i][1];
            boolean iscovered=false;
            for(int j=0;j<intervals.length;j++){
                int c=intervals[j][0];
                int d=intervals[j][1];

                if((i!=j) && (a>=c && d>=b) ){
                    iscovered=true;
                    break;
                }
            }
            if(!iscovered){
                count=count+1;
            }
        }
        return count;
        
    }
}