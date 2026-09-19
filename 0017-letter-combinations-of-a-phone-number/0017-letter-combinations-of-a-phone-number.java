class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, "", ans, map);

        return ans;
    }

    public void backtrack(
        int index,
        String digits,
        String current,
        List<String> ans,
        String[] map
    ) {

        // Base case
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        // Convert character digit into integer
        int digit = digits.charAt(index) - '0';

        // Get corresponding letters
        String letters = map[digit];

        // Try every possible letter
        for (char ch : letters.toCharArray()) {

            current = current + ch;

            backtrack(index + 1, digits, current, ans, map);

            current = current.substring(0, current.length() - 1);
        }
    }
}