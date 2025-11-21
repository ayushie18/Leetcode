class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstIdx=new HashMap<>();
        HashMap<Character,Integer> lastIdx=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!firstIdx.containsKey(ch)) firstIdx.put(ch,i);
            lastIdx.put(ch,i);
        }
        int count=0;
       
        for(char ch:firstIdx.keySet()){
            int l=firstIdx.get(ch);
            int r=lastIdx.get(ch);
            HashSet<Character> set=new HashSet<>();
            //if(l>=r) continue;
            for(int i=l+1;i<=r-1;i++){
                set.add(s.charAt(i));
            }
             count+=set.size();
        }

       return count;
        
    }
}