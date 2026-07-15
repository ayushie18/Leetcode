class Solution {
    public int helper(int a, int b){
    while(a>0 && b>0){    
        if(a>b){
            a=a%b;
        }
        else{
            b=b%a;
        }
    }
        if(a==0) return b;
        else return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        while(n>0){
            int val=1;
            sumOdd+=val;
            val+=2;
            n--;
        }

        int sumEven=0;
        while(n>0){
            int val=2;
            sumEven+=val;
            val+=2;
            n--;
        }

        return helper(sumOdd,sumEven);
        
    }
}