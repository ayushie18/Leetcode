   class Pair{
     String s;
     int no;
     Pair(String str,int n){
        this.s=str;
        this.no=n;
     }
    }
    class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
    PriorityQueue<Pair>maxHeap=new PriorityQueue<>((a,b)->
    {
        if(b.no==a.no){
            return a.s.compareTo(b.s);
        }
          return b.no-a.no;
    });

    for(String ele:map.keySet()){
        maxHeap.add( new Pair(ele,map.get(ele)));
    }

     ArrayList<String> ans=new ArrayList<>();
     while(k-->0){

        ans.add(maxHeap.poll().s);
     }
     
     return ans;
        
    }
}