class Solution {
    public int[] scoreValidator(String[] events) {
        int n=events.length;
        int score=0;
        int counter=0;
        for(int i=0;i<n;i++){
            if(counter>=10) break;
            String ch=events[i];
            if(ch.equals("W")){
                
                counter++;
            }
            else if(ch.equals("WD")){
                score++;
            }
            else if(ch.equals("NB")){
                score++;
            }
            else{
                score=score+ Integer.parseInt(events[i]);
            }
        }

        int [] ans=new int[2];
        ans[0]=score;
        ans[1]=counter;

        return ans;

        
    }
}