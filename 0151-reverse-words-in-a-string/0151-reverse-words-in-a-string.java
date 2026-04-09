class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' ')continue;
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
           
            sb.append(s.substring(j+1,i+1));
            sb.append(' ');

            i=j;
            
            }
        
        return sb.toString().trim();
        
    }
}