class Solution {
    public boolean hasMatch(String s, String p) {

        int star = p.indexOf('*');

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        // Find the first occurrence of the left part
        int leftPos = s.indexOf(left);

        if (leftPos == -1) {
            return false;
        }

        // Find the right part after the left part
        int rightPos = s.indexOf(right, leftPos + left.length());

        return rightPos != -1;
        
    }
}