class Solution {
    public int mostBooked(int n, int[][] meetings) {
         // sort meetings by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // min-heap of available rooms
        PriorityQueue<Integer> free = new PriorityQueue<>();
        for (int i = 0; i < n; i++) free.add(i);

        // min-heap of busy rooms -> {endTime, room}
        PriorityQueue<long[]> busy =
                new PriorityQueue<>((a, b) -> a[0] == b[0]
                        ? Long.compare(a[1], b[1])
                        : Long.compare(a[0], b[0]));

        int[] count = new int[n];

        for (int[] m : meetings) {
            long start = m[0], end = m[1];
            long duration = end - start;

            // free rooms that have finished before current meeting
            while (!busy.isEmpty() && busy.peek()[0] <= start) {
                free.add((int) busy.poll()[1]);
            }

            // if no room free → delay
            if (free.isEmpty()) {
                long[] room = busy.poll();
                start = room[0];
                busy.add(new long[]{start + duration, room[1]});
                count[(int) room[1]]++;
            }
            // room available
            else {
                int room = free.poll();
                busy.add(new long[]{end, room});
                count[room]++;
            }
        }

        // find room with maximum meetings
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] > count[ans]) ans = i;
        }
        return ans;
        
    }
}