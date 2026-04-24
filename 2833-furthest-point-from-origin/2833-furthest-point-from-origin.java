class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int LCount=0;
        int RCount=0;
        for(int i=0;i<n;i++){
            char c=moves.charAt(i);
            if(c=='L') LCount++;
            if(c=='R') RCount++;
        }
         int dist=0;
        for(int i=0;i<n;i++){
        char c=moves.charAt(i); 
           
           if(c=='R') dist+=1;
           else if(c=='L') dist-=1;
           else{
           if(LCount>RCount){
                dist-=1;
            }
            else{
            dist+=1;
           }
        }
    }    
    return Math.abs(dist);
    }
}