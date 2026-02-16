class Solution {
    public int reverseBits(int n) {
        String binary=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<32-binary.length();i++){
           ans+="0";
        }
        ans+=binary;
        StringBuilder sb=new StringBuilder(ans);
        ans=sb.reverse().toString();
        
        return Integer.parseInt(ans,2);

    }
}