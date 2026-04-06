class Solution {
    public boolean isIsomorphic(String s, String t) {
      char [] a=new char[128];
      char [] b=new char [128];
  for(int i=0;i<s.length();i++){
    char first= s.charAt(i);
    char second=t.charAt(i);
    int idx=(int)first;

    if(a[idx]=='\0') a[idx]=second;
    else{
         if(a[idx]!=second) return false;
    }
  }
   for(int i=0;i<s.length();i++){
    char first= t.charAt(i);
    char second=s.charAt(i);
    int idx=(int)first;

    if(b[idx]=='\0') b[idx]=second;
    else{
         if(b[idx]!=second) return false;
    }
  }

  
    return true;
 }
}