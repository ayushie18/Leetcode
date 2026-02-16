// import java.math.BigInteger; NOT ALLOWED
// class Solution {
//     public String multiply(String num1, String num2) {
//         BigInteger a=new BigInteger(num1);
//         BigInteger b=new BigInteger(num2);
//         return a.multiply(b).toString();
        
//     }
// }
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int ans[]=new int[num1.length()+num2.length()];
        int n=num1.length()-1, m=num2.length()-1;
        for(int i=n;i>=0;i--){
        for(int j=m;j>=0;j--){
             int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
             int sum=ans[i+j+1]+mul;
             ans[i+j+1]=sum%10;
             ans[i+j]+=sum/10;
        }
       }
      StringBuilder sb=new StringBuilder();
      for(int num:ans){
        if(!(sb.length()==0 && num==0)){
        sb.append(num);
        }
      }
    return sb.toString();
    }
}