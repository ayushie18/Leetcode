class Solution {
    public int priority(String s){
        if(s.equals("electronics")) return 0;
        if( s.equals("grocery")) return 1;
        if( s.equals("pharmacy"))return 2;
         else return 3;
    }
    public boolean isvalid(String s){
       return s.equals("electronics")||
              s.equals("grocery")||
              s.equals("pharmacy")||
              s.equals("restaurant");
              
    }
    public boolean alphanumericalAndUnderscore(String str){
        if(str.length()==0 || str==null) return false;
        for(char ch: str.toCharArray()){
          
            if(!(Character.isLetterOrDigit(ch)|| ch=='_')){
                return false;
            }
        }
        return true;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n=code.length;
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if( alphanumericalAndUnderscore(code[i]) &&  isvalid(businessLine[i]) &&isActive[i]){
                int p=priority(code[i]);
                ans.add(p+"#"+code[i]);
            }
        }

       Collections.sort(ans);  
        for(int i=0;i<ans.size();i++){
            ans.set(i,ans.get(i).split("#")[1]);
        }
       return ans;
    }
}