class Solution {
    int m=1000000007;
    Integer[][][] dp;
    public int solve(int zerosleft,int onesleft,int last,int limit){
        if(zerosleft==0 && onesleft==0){
            return 1;
        }
        if(dp[zerosleft][onesleft][last] != null)
            return dp[zerosleft][onesleft][last];
        int res=0;   
        if(last==1){
             for(int i=1;i<=Math.min(zerosleft,limit);i++){
                res=(res+solve(zerosleft-i,onesleft,0,limit))%m;
             }
        }
        else{
        for(int i=1;i<=Math.min(onesleft,limit);i++){
            res=(res+solve(zerosleft,onesleft-i,1,limit))%m;
        }

    }  
    return dp[zerosleft][onesleft][last] = (int)res;  

    }
    public int numberOfStableArrays(int zero, int one, int limit) {
        dp = new Integer[zero+1][one+1][2];
        int startWithZero=solve(zero,one,0,limit);
        int startWithOne=solve(zero,one,1,limit);
        return (startWithZero+startWithOne)%m;
    }
}