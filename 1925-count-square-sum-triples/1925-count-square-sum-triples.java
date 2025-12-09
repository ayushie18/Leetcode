class Solution {
    public int countTriples(int n) {
        int count=0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //        int third=i*i+j*j;
        //        int sqrthird=(int)Math.sqrt(third);
        //        if(sqrthird<=n && sqrthird*sqrthird==third) count++;
        //     }
        // }
        for(int i=1;i<=n;i++){
            int target=i*i;
            int l=1,r=n-1;
            while(l<=r){
                int sum=l*l+r*r;
                if(sum==target){
                    count+=2;
                    l++;
                    r--;
                }
                else if(sum>target){
                    r--;

                }
                else l++;
            }
        }


    return count;
        
    }
}