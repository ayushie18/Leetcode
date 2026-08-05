class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int i=0;
        int j=n-1;
        int score=0;
        int ans=0;
        while(i<=j){
         if(power>=tokens[i]){
            score++;
            power-=tokens[i];
            i++;
          }
          else if(score>0){
            score--;
            power+=tokens[j];
            j--;
          }
          else{
            break;
          }
          ans=Math.max(ans,score);
        }
       return ans; 
    }
}