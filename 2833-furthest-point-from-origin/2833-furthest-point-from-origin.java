class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int LCount=0;
        int RCount=0;
        int UCount=0;
        for(int i=0;i<n;i++){
            char c=moves.charAt(i);
            if(c=='L') LCount++;
            else if(c=='R') RCount++;
            else UCount++;
        }
    //      int dist=0;
    //     for(int i=0;i<n;i++){
    //     char c=moves.charAt(i); 
           
    //        if(c=='R') dist+=1;
    //        else if(c=='L') dist-=1;
    //        else{
    //        if(LCount>RCount){
    //             dist-=1;
    //         }
    //         else{
    //         dist+=1;
    //        }
    //     }
    // }    
    // return Math.abs(dist);
     
     return Math.abs(RCount-LCount)+UCount;

    }
}