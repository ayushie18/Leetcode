class Solution {
    public boolean isVowel(char c){
        if("aeiouAEIOU".indexOf(c)!=-1) return true;

       return false; 
    }
    public void swap(int a,int b, StringBuilder  sb){
        char c= sb.charAt(a);
        sb.setCharAt(a,sb.charAt(b));
        sb.setCharAt(b,c);
        
    }
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder(s);
         int n=s.length();
         int i=0;
         int j=n-1;
         while(i<=j){
            if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                swap(i,j,sb);
                i++; j--;
            }
            else if(isVowel(sb.charAt(i))) j--;

            else  if(isVowel(sb.charAt(j))) i++;

            else {

                i++;
                j--;
            }

         }

        return sb.toString(); 
    }
}