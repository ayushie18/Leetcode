class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> Lowerset=new HashSet<>();
        HashSet<Character> Upperset=new HashSet<>();

        int ans=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                Lowerset.add(c);
            }
            else{
                Upperset.add(c);
            }

        } 

        for(char ele:Upperset){
            if(Lowerset.contains(Character.toLowerCase(ele))){
                ans++;
            }
        }  
     
        return ans;
        
    }
}