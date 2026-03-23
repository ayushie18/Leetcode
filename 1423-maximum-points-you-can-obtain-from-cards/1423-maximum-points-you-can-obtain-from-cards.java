class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n=cardPoints.length;
      int max=0;
      int leftSum=0;
      int rightSum=0;

      for(int i=0;i<k;i++){
        leftSum+=cardPoints[i];
        max=Math.max(leftSum,max);
      }
       int rIdx=n-1;
      for(int i=k-1;i>=0;i--){
        leftSum-=cardPoints[i];
        rightSum+=cardPoints[rIdx];
        max=Math.max(max,leftSum+rightSum);
        rIdx--;
      }

      return max;  
    }
}