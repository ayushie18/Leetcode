class ProjectDetails{
    int profit;
    int capital;
    public ProjectDetails(int p,int c){
        this.profit=p;
        this.capital=c;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int cc=w;
        ProjectDetails [] pJs= new ProjectDetails[profits.length];

        for(int i=0;i<profits.length;i++){
            pJs[i]=new ProjectDetails(profits[i],capital[i]);
        }
        Arrays.sort(pJs ,(a,b)->a.capital-b.capital);

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        int p=0;
        for(int proj=0;proj<k;proj++){
            while(p<pJs.length && cc>=pJs[p].capital){
                maxHeap.add(pJs[p].profit);
                p++;
            }
            if(maxHeap.size()==0){
                return cc;
            }
            cc=cc+maxHeap.poll();
        }
        return cc;
           
    }
}