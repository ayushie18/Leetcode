/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        // int ans=0;
        //  while(lo<=hi){// TYPE 1 of BInary SeARCH
        //     int mid=lo+(hi-lo)/2;
        //      if(isBadVersion(mid)){
        //         ans=mid;
        //         hi=mid-1;
        //      }
        //      else{
        //         lo=mid+1;
        //      }
        //  }
        //  return ans;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;


        
    }
}