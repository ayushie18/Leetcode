class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
     
        final long MOD = 1_000_000_007L;

        // Convert to list to add boundaries
        List<Integer> hList = new ArrayList<>();
        for (int h : hFences) hList.add(h);
        hList.add(1);
        hList.add(m);

        List<Integer> vList = new ArrayList<>();
        for (int v : vFences) vList.add(v);
        vList.add(1);
        vList.add(n);

        // Sort fences
        Collections.sort(hList);
        Collections.sort(vList);

        // Store all possible horizontal distances
        Set<Integer> hDistances = new HashSet<>();
        for (int i = 0; i < hList.size(); i++) {
            for (int j = i + 1; j < hList.size(); j++) {
                hDistances.add(hList.get(j) - hList.get(i));
            }
        }

        long maxSide = -1;

        // Check vertical distances
        for (int i = 0; i < vList.size(); i++) {
            for (int j = i + 1; j < vList.size(); j++) {
                int dist = vList.get(j) - vList.get(i);
                if (hDistances.contains(dist)) {
                    maxSide = Math.max(maxSide, dist);
                }
            }
        }

        if (maxSide == -1) return -1;

        return (int) ((maxSide * maxSide) % MOD);
    }
}

  