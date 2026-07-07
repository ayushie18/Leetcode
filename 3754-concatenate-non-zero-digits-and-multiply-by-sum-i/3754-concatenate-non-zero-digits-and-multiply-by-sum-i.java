class Solution {
    public long sumAndMultiply(int n) {
       long x=0;
        while(n>0){
            long d=n%10;
            if(d!=0) x=x*10+d;
            n/=10;
        }
        long temp=x;
        long rev=0;
        while(temp>0){
            long dig =temp%10;
            rev=rev*10 +dig;
            temp/=10;
        }

        long sum=0;
        long temp2=rev;
         while(temp2>0){
            long digit=temp2%10;
            sum+=digit;
            temp2/=10;
        }

        return sum*rev;
        
    }
}