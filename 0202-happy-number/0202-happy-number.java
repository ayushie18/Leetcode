class Solution {
    public int squareOfDigit(int num){
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum+=dig*dig;
            num/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1 && squareOfDigit(fast)!=1 ){
            slow=squareOfDigit(slow);
            fast=squareOfDigit(squareOfDigit(fast));

        if(fast==1) return true;
        if(slow==fast) return false;
        }
        return true;
    }
}