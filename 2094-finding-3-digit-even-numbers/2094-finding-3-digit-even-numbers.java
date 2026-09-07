class Solution {
    public int[] findEvenNumbers(int[] digits) {
         int[] freq = new int[10];

        // Count available digits
        for (int d : digits) {
            freq[d]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 998; i += 2) {

            int x = i;

            int c = x % 10;
            x /= 10;

            int b = x % 10;
            x /= 10;

            int a = x;

            // Temporarily use the digits
            if (freq[a] > 0) {
                freq[a]--;

                if (freq[b] > 0) {
                    freq[b]--;

                    if (freq[c] > 0) {
                        ans.add(i);
                    }

                    freq[b]++;   // restore b
                }

                freq[a]++;       // restore a
            }
        }

        int[] result = new int[ans.size()];

        for (int j = 0; j < ans.size(); j++) {
            result[j] = ans.get(j);
        }

        return result;
        
    }
}