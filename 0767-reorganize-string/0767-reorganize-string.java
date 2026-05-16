class Solution {
    public String reorganizeString(String s) {
        // int[] freq=new int[26];
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     freq[ch-'a']++;
        // }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        PriorityQueue<int[]>maxHeap=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(char ch:map.keySet()){
          maxHeap.add(new int[]{ ch,map.get(ch)
        });
       }

       StringBuilder ans=new StringBuilder();

       while(maxHeap.size()>1){
        int[] first=maxHeap.poll();
        int[] second=maxHeap.poll();

        ans.append((char)first[0]);
        ans.append((char)second[0]);

        first[1]--;
        second[1]--;

        if(first[1]>0){
            maxHeap.add(first);
        }

        if(second[1]>0){
            maxHeap.add(second);
        }
       }
       while(!maxHeap.isEmpty()){
        int [] lastele=maxHeap.poll();
        if(lastele[1]>1){
            return "";
        }
        ans.append((char)lastele[0]);

       
    }


     return ans.toString();
        
    }
}