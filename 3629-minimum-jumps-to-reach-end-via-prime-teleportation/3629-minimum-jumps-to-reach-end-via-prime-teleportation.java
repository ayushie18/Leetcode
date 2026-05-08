class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Build factor -> indices map
        for(int i = 0; i < n; i++) {

            int x = nums[i];

            for(int p = 2; p * p <= x; p++) {

                if(x % p == 0) {

                    map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);

                    while(x % p == 0) {
                        x /= p;
                    }
                }
            }

            if(x > 1) {
                map.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[n];

        q.offer(0);

        visited[0] = true;

        int steps = 0;

        while(!q.isEmpty()) {

            int size = q.size();

            while(size-- > 0) {

                int i = q.poll();

                if(i == n - 1) {
                    return steps;
                }

                // adjacent left
                if(i - 1 >= 0 && !visited[i - 1]) {

                    visited[i - 1] = true;

                    q.offer(i - 1);
                }

                // adjacent right
                if(i + 1 < n && !visited[i + 1]) {

                    visited[i + 1] = true;

                    q.offer(i + 1);
                }

                int val = nums[i];

                // teleport only if val itself is prime
                if(isPrime(val) && map.containsKey(val)) {

                    for(int next : map.get(val)) {

                        if(!visited[next]) {

                            visited[next] = true;

                            q.offer(next);
                        }
                    }

                    // IMPORTANT optimization
                    map.remove(val);
                }
            }

            steps++;
        }

        return -1;
    }

    private boolean isPrime(int x) {

        if(x < 2) return false;

        for(int i = 2; i * i <= x; i++) {

            if(x % i == 0) {
                return false;
            }
        }

        return true;
        
    }
}