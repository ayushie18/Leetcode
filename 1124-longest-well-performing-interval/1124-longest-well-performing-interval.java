class Solution {
    public int longestWPI(int[] hours) {
        int preSum=0;
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<hours.length;i++){
            if(hours[i]>8){
                hours[i]=1;
            }
            else{
                hours[i]=-1;
            }
            preSum+=hours[i];
            if(preSum>0) maxLen=Math.max(maxLen,i+1);

            if(map.containsKey(preSum-1)){
                maxLen=Math.max(maxLen,i-map.get(preSum-1));
            }

            if(!map.containsKey(preSum)){
                map.put(preSum,i);
            }

            
        }
        return maxLen;
        
    }
}