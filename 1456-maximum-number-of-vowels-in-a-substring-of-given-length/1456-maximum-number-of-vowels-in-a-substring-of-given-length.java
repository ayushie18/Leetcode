class Solution {
    public boolean isvowel(char c){
        return"aeiou".indexOf(c)!=-1;

    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isvowel(c)){
               count++;
            }
         max=Math.max(max,count);
        }
        for(int i=k;i<n;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);

        }
        return max;
        
        
    }
}