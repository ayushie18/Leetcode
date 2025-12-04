class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            map1.put(c1,map1.getOrDefault(c1,0)+1);
        }

        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
         char c2=t.charAt(i);
         map2.put(c2,map2.getOrDefault(c2,0)+1);
        }
            for (char key : map1.keySet()) {
            if (!map2.containsValue(map1.get(key))) {
                return false;
            }
        }
    return true;
 }
}