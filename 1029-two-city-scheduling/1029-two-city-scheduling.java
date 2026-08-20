class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
        int n=costs.length;
        int total_cost=0;
        int i=0;
        for(int[] cost:costs){
            if(i<n/2){
            total_cost+=cost[0];
            i++;
            }

            else {
                total_cost+=cost[1];
                i++;
            }
        }
        return total_cost;

        
    }
}