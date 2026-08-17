class Solution {
    class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String reorganizeString(String s) {
    HashMap<Character,Integer>map=new HashMap<>();

    for(int i=0;i<s.length();i++){
        char ele=s.charAt(i);
        map.put(ele,map.getOrDefault(ele,0)+1);

    }

    PriorityQueue<Pair> maxHeap=new PriorityQueue<>((a,b)->b.freq-a.freq);

    for(char ele:map.keySet()){
        maxHeap.add(new Pair(ele,map.get(ele)));
    }

    StringBuilder ans=new StringBuilder();
    while(maxHeap.size()>1){
        Pair first=maxHeap.poll();
        Pair second=maxHeap.poll();

        ans.append(first.ch);
        ans.append(second.ch);

        if((first.freq-1)>0){
            maxHeap.add(new Pair(first.ch,first.freq-1));
        }

        if((second.freq-1)>0){
        maxHeap.add(new Pair(second.ch,second.freq-1));
        }
        
    }

    while(!maxHeap.isEmpty()){
        Pair last=maxHeap.poll();
        int f=last.freq;
        if(f>1){
            return "";
        }
        else{
            ans.append(last.ch);
        }
    }

   return ans.toString();
        
    }
}