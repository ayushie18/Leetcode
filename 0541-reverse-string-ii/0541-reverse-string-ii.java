class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int m=0;m<s.length();m+=2*k){
         int i=m;
         int j=Math.min(m+k-1,s.length()-1);
        while(i<j){
           char temp=s.charAt(i);
           sb.setCharAt(i,s.charAt(j));
           sb.setCharAt(j,temp);
           i++;
           j--;
        }
        }
       return sb.toString(); 
    }
}