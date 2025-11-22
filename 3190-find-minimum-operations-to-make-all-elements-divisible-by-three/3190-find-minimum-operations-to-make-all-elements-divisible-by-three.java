class Solution {
    public int minimumOperations(int[] nums) {
        int opr=0;
        for(int i:nums){
            if(i%3==0)continue;
            else if(i%3==1 || i%3==2){
                opr+=1;
            }
        }
        return opr;
    }
}