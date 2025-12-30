class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        int i= word.indexOf(ch);
        String s=word.substring(0,i+1);

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        while(i<n-1){
            sb.append(word.charAt(i+1));
            i++;
        }


      return sb.toString();  
    }
}