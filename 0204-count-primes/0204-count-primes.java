class Solution {

  public int countPrimes(int n) {
    if(n<=2) return 0;

    boolean[] isPrime=new boolean[n];
    for(int i=0;i<n;i++){
        isPrime[i]=true;
    }

    isPrime[0]=false;
    isPrime[1]=false;

    for(int i=2;i*i<=n;i++){
        if(isPrime[i]==true){
            for(int j=i*i;j<n;j+=i){
                isPrime[j]=false;
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