class Solution {
    public int helper(int[] firstActivityStartTime, int[] firstDuration, int[] secondActivityStartTime, int[] secondDuration){
        int finish1=Integer.MAX_VALUE;
        for(int i=0;i<firstActivityStartTime.length;i++){
            finish1=Math.min(finish1, firstActivityStartTime[i]+firstDuration[i]);
        }
        int finish2=Integer.MAX_VALUE;
        for(int i=0;i<secondActivityStartTime.length;i++){
            finish2=Math.min(finish2, Math.max(finish1,secondActivityStartTime[i])+secondDuration[i]);
        }
        return finish2;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int choice1=helper(landStartTime, landDuration,waterStartTime,waterDuration);
        int choice2=helper(waterStartTime,waterDuration,landStartTime, landDuration);
   

        return Math.min(choice1, choice2);
        
    }
}