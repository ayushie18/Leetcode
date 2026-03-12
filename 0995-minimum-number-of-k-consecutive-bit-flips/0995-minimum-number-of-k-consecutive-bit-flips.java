class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flips = 0;
        int flipCountPast = 0;
        boolean[] isFlipped = new boolean[n];

        for(int i = 0; i < n; i++) {

            if(i >= k && isFlipped[i - k]) {
                flipCountPast--;
            }

            if(flipCountPast % 2 == nums[i]) {
                if(i + k > n) return -1;

                flipCountPast++;
                flips++;
                isFlipped[i] = true;
            }
        }

        return flips;
    }
}
      
 

        
