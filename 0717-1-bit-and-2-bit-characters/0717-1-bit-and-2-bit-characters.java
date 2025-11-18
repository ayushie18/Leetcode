class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        if(n==1) {
            if(bits[0]==0) return true;
        }
        for(int i=bits.length-1;i>0;i--){
          if(bits[i]==0){
            if (bits[i]==bits[i-1]) return true;
          }
          }
  return false;
        
    }
}