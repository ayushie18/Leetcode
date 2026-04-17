class Solution {
    private int reverse(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> lidx=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int v=nums[i];
            if(lidx.containsKey(v)){
                min=Math.min(min,i-lidx.get(v));
            }
            int rev=reverse(v);
            lidx.put(rev,i);
        }
        if (min==Integer.MAX_VALUE) return -1;
       return min; 
    }
}