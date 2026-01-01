class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==1) {
            if(digits[0]==9){
                return new int []{1,0};
            }
            else {return new int[]{
                digits[0]+1
            };}
        }

       int ans[] =new int[digits.length];
       for(int i=0;i<digits.length;i++){
        ans[i]=digits[i];
       }

       ans[digits.length-1]=ans[digits.length-1]+1;

       return ans;
        
    }

}