class CharacterCount{
     int count;
     char c;
     public CharacterCount(int _count,char _c){
        count=_count;
        c=_c;
     }

    }
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<CharacterCount> maxHeap=new PriorityQueue<CharacterCount>((x,y)->y.count-x.count); 

        if(a>0){
            maxHeap.add( new CharacterCount(a,'a'));
        }
         if(b>0){
            maxHeap.add( new CharacterCount(b,'b'));
        }
         if(c>0){
            maxHeap.add( new CharacterCount(c,'c'));
        }
     

        StringBuilder res= new StringBuilder();

        while(!maxHeap.isEmpty()){
            CharacterCount maxEle=maxHeap.poll();
            int count=maxEle.count;
            char _c=maxEle.c;

            if(res.length()>=2 && res.charAt(res.length()-1)==_c && res.charAt(res.length()-2)==_c){
              if(maxHeap.isEmpty()){
               break; 
              } 

              CharacterCount secondMaxEle=maxHeap.poll();
              int scount=secondMaxEle.count;
              char sc=secondMaxEle.c;

              res.append(sc);
              scount=scount-1;
              if(scount>0){
                maxHeap.add(new CharacterCount(scount,sc));
              }
            }

            else{
                res.append(_c);
                count--;
            } 

            if(count>0){
                maxHeap.add(new CharacterCount(count,_c));
            }
        }
    

     return res.toString();

 }
}