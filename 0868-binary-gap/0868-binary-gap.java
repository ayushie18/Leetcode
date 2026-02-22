class Solution {
    public int binaryGap(int n) {
        String num=Integer.toBinaryString(n);
        int max=0;
        for(int i=0;i<num.length();i++){
            int len=0;
             if(num.charAt(i)=='1')
            for(int j=i+1;j<num.length();j++){
                if(num.charAt(j)=='1'){
                    len=j-i;
                    break;
                }
                

            }
            max=Math.max(max,len);

        }
       return max; 
    }
}