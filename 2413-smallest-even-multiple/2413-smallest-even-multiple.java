class Solution {
    public int gcd(int a, int b){
    //  if(a%b==0) return b;
    //   return gcd(b,a%b);
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
    }
    public int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public int smallestEvenMultiple(int n) {
        return lcm(2,n);
    }
}