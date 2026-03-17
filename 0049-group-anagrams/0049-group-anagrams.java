class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String s =new String(ch);
            // int[] freq=new int[26];
            // for( char c:strs[i].toCharArray()){
            //     freq[c-'a']++;
            // }
            // String s=Arrays.toString(freq);
             
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            } 
            map.get(s).add(strs[i]);

        }

        for(List<String> list:map.values()){
            ans.add(list);
        }
       return ans; 
    }
}