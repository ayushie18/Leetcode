class Solution {
    // private boolean isValid(int[] window, int[] need) {
    //      for (int i = 0; i < 256; i++) {
    //          if (window[i] < need[i]) {
    //             return false;
    //         }
    //     }
    //   return true;
    //}
    public String minWindow(String s, String t) {
        int [] need=new int[256];
        for(char ch:t.toCharArray()){
            need[ch]++;
        }

        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int right=0, left=0;
        int count=0;
        while(right<s.length()){
            if(need[s.charAt(right)]>0) count++;
            need[s.charAt(right)]--;

            while(count==t.length()){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                need[s.charAt(left)]++;
                if(need[s.charAt(left)]>0){
                    count--;
                }
                left++;
            }
           right++;
        }
return start == -1 ? "" : s.substring(start, start + minLen);
    }
}