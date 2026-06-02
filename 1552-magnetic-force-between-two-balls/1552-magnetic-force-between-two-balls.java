class Solution {
    public boolean isPossible(int mid, int[] position,int m){
        int balls=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last>=mid){
                balls++;
                last=position[i];
            }
        }
        return balls>=m;    
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=0;
        int hi=position[position.length-1]-position[0];
      
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid,position,m)){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }

        return hi;
        
    }
}