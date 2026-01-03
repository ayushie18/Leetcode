class Solution {
    static final int M = 1_000_000_007;

    List<String> columnStates = new ArrayList<>();

    // generateColumnStates(curr, prevChar, l, m)
    void generateColumnStates(String curr, char prevChar, int l, int m) {
        if (l == m) {
            columnStates.add(curr);
            return;
        }

        char[] colors = {'R', 'G', 'B'};
        for (char ch : colors) {
            if (ch == prevChar) continue;
            generateColumnStates(curr + ch, ch, l + 1, m);
        }
    }

    // solve(remainCols, prevIdx, m)
    int solve(int remainCols, int prevIdx, int m) {
        if (remainCols == 0) {
            return 1;
        }

        int ways = 0;
        String prevState = columnStates.get(prevIdx);

        for (int i = 0; i < columnStates.size(); i++) {
            if (i == prevIdx) continue;

            String currState = columnStates.get(i);
            boolean valid = true;

            for (int j = 0; j < m; j++) {
                if (prevState.charAt(j) == currState.charAt(j)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ways = (ways + solve(remainCols - 1, i, m)) % M;
            }
        }

        return ways;
    }
    public int colorTheGrid(int m, int n) {
         generateColumnStates("", '#', 0, m);

        int result = 0;
        for (int i = 0; i < columnStates.size(); i++) {
            result = (result + solve(n - 1, i, m)) % M;
        }

        return result;
    }
        
    }
