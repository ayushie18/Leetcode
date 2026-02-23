class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
           String ans= s.substring(i,i+k);
           set.add(ans);

        }
         return set.size()==Math.pow(2,k);
        
    }
}