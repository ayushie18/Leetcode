class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
       StringBuilder sb=new StringBuilder(s);
       for(int i=0;i<sb.length();i+=2*k){
        int left=i;
        int right=Math.min(n-1,i+k-1);
        while(left<right){
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
         
       } 

        return sb.toString();
    }   
}