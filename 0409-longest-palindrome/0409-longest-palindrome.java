class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       

        for(char key:map.keySet()){
            int freq=map.get(key);
            if(map.size()==1) return freq;
            if(freq%2==0){
                ans+=freq;
            }
        }
    
        return ans+1;
    }
}