class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String []parts=path.split("/"); 
        for(String s:parts){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..") ){
                if(!st.isEmpty())st.pop();
                
            }
            else{
                st.push(s);
            }

        }
        StringBuilder ans=new StringBuilder();
         for(String ele:st){
            ans.append("/");
            ans.append(ele);
         }

        if(ans.length()==0) return new String("/");
        return ans.toString(); 
    }
}