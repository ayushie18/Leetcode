class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int minDel=0;
        int countB=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                countB++;
            }
            else{
                minDel=Math.min(minDel+1,countB);
            }
            
        }
        return minDel;
        
    }
}