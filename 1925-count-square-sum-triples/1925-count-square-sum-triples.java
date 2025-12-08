class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               int third=i*i+j*j;
               int sqrthird=(int)Math.sqrt(third);
               if(sqrthird<=n && sqrthird*sqrthird==third) count++;
            }
        }
    return count;
        
    }
}