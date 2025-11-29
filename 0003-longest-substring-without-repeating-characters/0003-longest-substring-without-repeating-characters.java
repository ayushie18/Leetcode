class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        while(i<s.length()){
            HashSet<Character> set=new HashSet<>();
            int j=i;
            while(j<s.length()){
                char ch=s.charAt(j);
            
            if(set.contains(ch)){
                break;
            }
            set.add(ch);
            int len=j-i+1;
            max=Math.max(len,max);
            j++;
            }
            i++;
           
        }
       return max; 
    }
}