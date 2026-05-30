class Solution {

    public List<Boolean> getResults(int[][] queries) {

        TreeSet<Integer> set = new TreeSet<>();
        int mx = 0;

        for (int[] q : queries) {
            if (q[0] == 1) {
                mx = Math.max(mx, q[1]);
            } else {
                mx = Math.max(mx, q[1]);
            }
        }

        // all obstacle positions
        set.add(0);

        for (int[] q : queries) {
            if (q[0] == 1) {
                set.add(q[1]);
            }
        }

        int size = mx + 2;

        SegmentTree seg = new SegmentTree(size);

        // initialize gaps
        Integer prev = null;

        for (int x : set) {
            if (prev != null) {
                seg.update(x, x - prev);
            }
            prev = x;
        }

        List<Boolean> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {

            int[] q = queries[i];

            if (q[0] == 2) {

                int x = q[1];
                int sz = q[2];

                Integer left = set.floor(x);

                int best = seg.query(0, left);

                boolean ok = best >= sz;

                // check tail segment
                ok |= (x - left >= sz);

                ans.add(ok);

            } else {

                int x = q[1];

                Integer l = set.lower(x);
                Integer r = set.higher(x);

                // remove obstacle
                set.remove(x);

                if (r != null) {
                    seg.update(r, r - l);
                }
            }
        }

        Collections.reverse(ans);

        return ans;
    }

    class SegmentTree {

        int[] tree;
        int n;

        SegmentTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        void update(int node, int l, int r, int idx, int val) {

            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) / 2;

            if (idx <= mid) {
                update(node * 2, l, mid, idx, val);
            } else {
                update(node * 2 + 1, mid + 1, r, idx, val);
            }

            tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        int query(int L, int R) {
            return query(1, 0, n - 1, L, R);
        }

        int query(int node, int l, int r, int L, int R) {

            if (R < l || r < L) return 0;

            if (L <= l && r <= R) {
                return tree[node];
            }

            int mid = (l + r) / 2;

            return Math.max(
                    query(node * 2, l, mid, L, R),
                    query(node * 2 + 1, mid + 1, r, L, R)
            );
        }
    }
}