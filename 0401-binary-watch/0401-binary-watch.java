class Solution {
     public int countBits(int n){
        int count = 0;
        while(n > 0){
            count += n % 2;
            n = n / 2;
        }
        return count;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<=11;i++){
            for(int j=0;j<=59;j++){

               // if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                 if(countBits(i)+countBits(j)==turnedOn){
                    String min= (j<10)?"0"+j:""+j;
                    ans.add(i+":"+min);
                }
                
            }
        }
        return ans;
        
    }
}