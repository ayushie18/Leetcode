class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        // HashSet<Character> Lowerset=new HashSet<>();
        // HashSet<Character> Upperset=new HashSet<>();
        // for(int i=0;i<word.length();i++){
        //     char c=word.charAt(i);
        //     if(Character.isLowerCase(c)){
        //         Lowerset.add(c);
        //     }
        //     else{
        //         Upperset.add(c);
        //     }
        // } 
        // for(char ele:Upperset){
        //     if(Lowerset.contains(Character.toLowerCase(ele))){
        //         ans++;
        //     }
        // }
        boolean[] lower=new boolean[26];
        boolean[] upper=new boolean[26];
        for(char c:word.toCharArray()) {
            if(Character.isLowerCase(c)){
                lower[c-'a']=true;
            }
            else upper[c-'A']=true;

        } 
        for(int i=0;i<26;i++){
            if(lower[i] && upper[i]){
                ans++;
            }
        }
        return ans;
        
    }
}