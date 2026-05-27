class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lower=new HashMap<>();
        HashMap<Character,Integer> upper=new HashMap<>();

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.put(ch,i);
            }
            else{
                if(upper.containsKey(ch)) continue;
                else upper.put(ch,i);
            }
        }

        int ans=0;
        for(char key : lower.keySet()){
            char c=Character.toUpperCase(key);
            if(upper.containsKey(c)){
              if(lower.get(key)<upper.get(c)){
                        ans++;
                 }

                 
            }

         }
         return ans;

        
    }
}