class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int max=0;//BRUTE FORCE
    //     int i=0;
    //     while(i<s.length()){
    //         HashSet<Character> set=new HashSet<>();
    //         int j=i;
    //         while(j<s.length()){
    //             char ch=s.charAt(j);
            
    //         if(set.contains(ch)){
    //             break;
    //         }
    //         set.add(ch);
    //         int len=j-i+1;
    //         max=Math.max(len,max);
    //         j++;
    //         }
    //         i++;
           
    //     }
    //    return max; 
//    int i=0,j=0; USING HASHSET
//    int max=0;
//    HashSet<Character> set=new HashSet<>();
//    while(j<s.length()){
//     char c=s.charAt(j);
//         while(set.contains(c)){
//         set.remove(s.charAt(i));
//         i++;
//     }
//     set.add(c);
//     max=Math.max(max,j-i+1);
//     j++;
//    }

//    return max;
  int maxLen=0;
  int i=0,
      j=0;
  HashMap<Character,Integer> map=new HashMap<>();
  while(j<s.length()){
    char ch=s.charAt(j);
    if(map.containsKey(ch)){
        if(map.get(ch)>=i){
            i=map.get(ch)+1;
        }
    }
    map.put(ch,j);
    maxLen=Math.max(j-i+1,maxLen);
    j++;
  }  
  return maxLen;  

 }
}