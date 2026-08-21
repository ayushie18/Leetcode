class Solution {
    public int findMinArrowShots(int[][] points) {
        // ArrayList<int[]>arr=new ArrayList<>();
        // Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));

        // arr.add(points[0]);

        // for(int i=1;i<points.length;i++){
        //     int start=points[i][0];
        //     int end=points[i][1];
        //     int[] prev=arr.get(arr.size()-1);

        //     if(start<=prev[1]){
        //         prev[0]=Math.max(prev[0],start);
        //         prev[1]=Math.min(prev[1],end);
                  
        //     }
        //     else{
        //         arr.add(points[i]);
        //     }


        // }
        // return arr.size();

        //2.optimal using sort by end

        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int arrow=1;
        int arrPos=points[0][1];

        for(int i=1;i<points.length;i++){
            int start=points[i][0];
            if(start>arrPos){
                arrow++;
                arrPos=points[i][1];
            }
        }
        return arrow;

    }
}