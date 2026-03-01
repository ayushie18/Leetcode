class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        
        // Iterate through each character in the string
        for (char c : n.toCharArray()) {
            // Convert char to int ('0' is 48 in ASCII)
            int currentDigit = c - '0';
            
            // Update the maximum found so far
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            
            // Optimization: if we hit 9, we can't go any higher
            if (maxDigit == 9) return 9;
        }
        
        return maxDigit;
        
    }
}