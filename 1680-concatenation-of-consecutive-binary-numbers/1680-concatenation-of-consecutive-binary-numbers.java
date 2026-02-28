class Solution {
    public int concatenatedBinary(int n) {
        long ans=0;
        int m=1000000007;
        for(int i=1;i<=n;i++){
            int bits=Integer.toBinaryString(i).length();
            ans=((ans<<bits)%m+i)%m;
        }
        return (int)ans;
        
    }
}