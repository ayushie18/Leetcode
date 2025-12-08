class Solution {
    public String largestOddNumber(String num) {
        int n=Integer.valueOf(num);
        if(n%2!=0) return num;
        String ans="";
        for(int i=0;i<num.length();i++){
            int a=Integer.valueOf(num.charAt(i));
            if(a%2!=0){
                ans+=num.charAt(i);
            }
        }
        return ans;
    }
}