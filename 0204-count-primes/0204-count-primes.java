class Solution {

  public int countPrimes(int n) {
    if(n<=1) return 0;

    boolean[] isPrime=new boolean[n+1];
    for(int i=0;i<n;i++){
        isPrime[i]=true;
    }

    isPrime[0]=false;
    isPrime[1]=false;

    for(int i=2;i*i<=n;i++){
        if(isPrime[i]==true){
            for(int j=2;i*j<=n;j++){
                isPrime[i*j]=false;
            }
        }
    }
     
    int ans=0;
    for(int i=0;i<n;i++){
        if(isPrime[i]==true) ans++;

    }
    return ans;
  
 }
}