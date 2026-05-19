class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            int no=(num.charAt(i)-'0');

            while(!st.isEmpty() && st.peek()>no && k>0){
                st.pop();
                k--;
            }
            st.add(no);
        }
         while(k-->0){
            st.pop();
            }
       
        StringBuilder ans=new StringBuilder();

        while(!st.isEmpty()){
        ans.append(st.pop());
        }

        ans.reverse();
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }

       
        if(ans.length()==0) return "0";
        return ans.toString();
        
    }
}