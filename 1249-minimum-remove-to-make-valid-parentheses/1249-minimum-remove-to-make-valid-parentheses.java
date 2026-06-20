class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                st.push(i);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    set.add(i);
                }
            }

        }
        while(!st.isEmpty()){
            set.add(st.pop());
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(set.contains(i)) continue;

            sb.append(s.charAt(i));
        }
        return sb.toString();

        
    }
}