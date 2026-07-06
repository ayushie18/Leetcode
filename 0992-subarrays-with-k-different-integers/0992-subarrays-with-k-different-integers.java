class Solution {
    public int helper(int[] nums, int k){
        if (k < 0) return 0;
        int count=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
                
            }
            count=count+(right-left+1);
            right ++;
        }
        return count;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        //return helper(nums,k)-helper(nums,k-1);
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int baseLeft = 0;   // Left boundary before removing duplicate elements
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Shrink if distinct elements exceed k
            while (map.size() > k) {

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
                baseLeft = left;
            }

            // Remove unnecessary duplicate elements from the left
            while (map.get(nums[left]) > 1) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            // Count subarrays ending at 'right' with exactly k distinct elements
            if (map.size() == k) {
                ans += left - baseLeft + 1;
            }
        }

        return ans;
       
        
    }
}