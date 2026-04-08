class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
       return sb.toString(); 
    }
}