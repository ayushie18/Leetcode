class Solution {
    public int countHomogenous(String s) {
        int mod=1000000007;
        int count=1;
        int freq=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                freq++;
            }
            else{
               freq=1;
            }

            count=(count+freq)%mod;
        }

        return count;
        
    }
}