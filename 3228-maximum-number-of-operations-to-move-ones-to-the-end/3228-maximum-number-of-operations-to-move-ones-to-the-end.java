class Solution {
  public int maxOperations(String s) {
        int ones = 0;
        int ops = 0;
        boolean blocked = false;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
                blocked = true; 
            } else {  // c == '0'
                if (blocked) {
                    ops += ones;
                    blocked = false;
                }
            }
        }
        return ops;
    }
}

      
      
      
 