class Solution {
    public int fourdivisors(int n){
        int count=0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0 ){ 
             int div=n/i;
             if(div==i){
                count++;
                sum+=i;
             }
             else{
             count+=2;
             sum+=i+div;
             }
            }
        }
        if(count==4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
           ans+=fourdivisors(nums[i]);
        }
        return ans;
    }
}