class Solution {
  public boolean startEndwithVowel(String s){
    int n=s.length()-1;
    if((s.charAt(0)=='a'|| s.charAt(0)=='e'||
    s.charAt(0)=='i'|| s.charAt(0)=='o'||s.charAt(0)=='u') && (s.charAt(n)=='a'|| s.charAt(n)=='e'||s.charAt(n)=='i'|| s.charAt(n)=='o'||s.charAt(n)=='u')){
    return true;
    }
    return false;
  }
  public int vowelStrings(String[] words, int left, int right) {
      int ans=0;
    for(int i=left;i<=right;i++){
        String ele=words[i];
        if(startEndwithVowel(ele)){
           ans++;
        }

    
    }
return ans;
}
}

