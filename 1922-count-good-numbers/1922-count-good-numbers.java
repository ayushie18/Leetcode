class Solution {

    int mod=1000000007;
    public long pow(long a,long b){
        if(b==0) return 1;
        long half=pow(a,b/2);
        long res=(half*half)%mod;
        if(b%2==1){
            res=(res*a)%mod;
        }
        return res;

    }
    public int countGoodNumbers(long n) {
        return (int)((pow(5,(n+1)/2)*pow(4,n/2))%mod);
     
    }
}