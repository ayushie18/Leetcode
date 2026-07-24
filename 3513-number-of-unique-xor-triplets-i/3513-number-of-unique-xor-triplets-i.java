class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // find nearest 2^x of n when n is greater than 2 
        // n==1 or n==2 return n
        int n=nums.length;
        if(n<=2) return n;
        int ans=1;
        while(ans<=n){
            ans*=2;
        }
        return ans;
        
    }
}