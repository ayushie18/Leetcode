class Solution {
    public boolean isPrime(int n){
       if(n<2) return false;
       for(int i=2;i*i<=n;i++){
          if(n%i==0){
            return false;
          }
        }
       
       return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
             int no=nums[i][i];
             if(isPrime(no)){
                max=Math.max(no,max);
             }
             if(i!=n-i-1){
                no=nums[i][n-i-1];
                if(isPrime(no)){
                 max=Math.max(no,max);
                }

              }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
        }
}