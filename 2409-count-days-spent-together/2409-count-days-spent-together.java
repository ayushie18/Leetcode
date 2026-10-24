class Solution {

    int [] arr= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
   public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
    int ans=0;
    int startA=getDays(arriveAlice);
    int endA=getDays(leaveAlice);
    int startB=getDays(arriveBob);
    int endB=getDays(leaveBob);
    
    int startOverlap=Math.max(startA,startB);
    int endOverlap=Math.min(endA,endB);

    if(startOverlap<=endOverlap){
        ans=endOverlap-startOverlap+1;
    }
    return ans;


   }  
    
    public int getDays(String date){
        int day=Integer.parseInt(date.substring(3));
        int month=Integer.parseInt(date.substring(0,2));

        int totaldays=day;
        for(int i=0;i<month-1;i++){
            totaldays+=arr[i];
        }
       return totaldays;
    }
}