class Solution {
    public int maxProduct(int n) {
        String str=Integer.toString(n);
        int[] digits=new int[str.length()];

        for(int i=0;i<str.length();i++){
            digits[i]=str.charAt(i)-'0';

        }

        Arrays.sort(digits);

        return digits[str.length()-1]*digits[str.length()-2];
        
    }
}