class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long num=n;
        if(num<0){
            x=1/x;
            num=-num;
        }
        while(num>0){
            if(num%2==1){
                ans=ans*x;
                num=num-1;
            }
            else{
                num=num/2;
                x=x*x;
            }
        }
         
        return ans;
    
    }
}