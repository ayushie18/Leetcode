class Solution {
    public int numSub(String s) {
        long count = 0, curr = 0;
        long mod = 1000000007;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                curr++;
                count = (count + curr) % mod;
            } else {
                curr = 0;
            }
        }
        return (int) count;
    }
}
        
    
