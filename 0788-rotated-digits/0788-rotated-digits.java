class Solution {
    public boolean goodNum(int x){
        boolean flag=false;
        while(x>0){
            int digit=x%10;
            if(digit==3||digit==4||digit==7) return false;

            if(digit==2||digit==5||digit==6|| digit==9){
                flag=true;
            } 
            x/=10;
        }
        return flag;
         
       
    }
    
    public int rotatedDigits(int n) {
        int ans=0;
      for(int i=1;i<=n;i++){
        if(goodNum(i)){
          ans++;
       }
    }  

     return ans;   
    }
}