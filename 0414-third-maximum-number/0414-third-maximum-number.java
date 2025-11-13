class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i :nums){
            if(i>max){
                max=i;
            }
        }
        int max2=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max2 && i!=max){
                max2=i;
            }
        }
        int max3=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max3 && i!=max && i!=max2){
                max3=i;
            }
        }
        if(max2==Integer.MIN_VALUE || max3==Integer.MIN_VALUE || max2==max3|| nums.length<3 ) return max;
        return max3;
 }
}