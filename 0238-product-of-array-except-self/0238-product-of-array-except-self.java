class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prePro=new int[nums.length];
        prePro[0]=1;
        for(int i=1;i<nums.length;i++){
            prePro[i]=prePro[i-1]*nums[i-1];

        }
        // int[] sufPro=new int[nums.length];
        // sufPro[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     sufPro[i]=sufPro[i+1]*nums[i+1];
        // }
        int suf=1;
       // int ans[]=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            suf*=nums[i+1];
            prePro[i]*=suf;
        }

        return prePro;
        

        
    }
}