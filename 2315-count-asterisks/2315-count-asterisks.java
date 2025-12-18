class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int ans=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='|'){
                flag=!flag;
            }
            if(ch=='*' && !flag){
                ans++;
                }
        }
     return ans; 
    }
}