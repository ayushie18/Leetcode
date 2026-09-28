class Solution {
    public int maxDepth(String s) {
       // Stack<Character> st=new Stack<>();
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(ch=='('){
              //  st.push(ch);
              count++;

             }
             else if(ch==')'){
              //  st.pop();
              count--;
             }

            // max=Math.max(st.size(),max);
            max=Math.max(count,max);

        }
        return max;
        
    }
}