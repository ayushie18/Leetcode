class Solution {
    public int countDays(int days, int[][] meetings) {
        int gap=0;
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        list.add(meetings[0]);
        for(int i=1;i<meetings.length;i++){
            int[] prev=list.get(list.size()-1);
            if(prev[1]>=meetings[i][0]){
                 prev[0]=Math.min(prev[0],meetings[i][0]);
                 prev[1]=Math.max(prev[1],meetings[i][1]);
            }
            else{
               list.add(meetings[i]); 
            }
            
        }
        for(int i=1;i<list.size();i++){
            gap+=list.get(i)[0]-list.get(i-1)[1]-1;
        }
        gap+=list.get(0)[0]-1;
        gap=gap+days-list.get(list.size()-1)[1];

        return gap;
    }
}