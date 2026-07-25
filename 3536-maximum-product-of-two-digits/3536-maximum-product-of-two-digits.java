class Solution {
    public int maxProduct(int n) {
        // String str=Integer.toString(n);
        // int[] digits=new int[str.length()];

        // for(int i=0;i<str.length();i++){
        //     digits[i]=str.charAt(i)-'0';

        // }

        // Arrays.sort(digits);

        // return digits[str.length()-1]*digits[str.length()-2];
       
        int max1=0;
        int max2=0;
        while(n>0){
        int digit=n%10;
        if(digit>max1){
            
               max2=max1;
               max1=digit;
        }
        else if(digit>max2){
            max2=digit;
        }
        n/=10;
       }
       return max1*max2;

        
    }
}