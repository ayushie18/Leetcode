class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->Integer.compare(a[1],b[1]));

        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        int totalTime=0;

        for(int[] course:courses){
            int duration=course[0];
            int deadline=course[1];

            // if we take the course
            totalTime+=duration;
            maxHeap.add(duration);

            if(totalTime>deadline){
                totalTime-=maxHeap.poll();
            }

        }

        return maxHeap.size();
    }
}