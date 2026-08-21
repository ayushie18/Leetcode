class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        for(int g:gas){
            total_gas+=g;
        }
        int total_cost=0;
        for(int c:cost){
            total_cost+=c;
        }

        if(total_cost>total_gas) return -1;
        int start=0;
        int fuel=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i]-cost[i];
            
            if(fuel<0){
                start=i+1;
                fuel=0;
            }
         
        }

        return start; 
    }
}