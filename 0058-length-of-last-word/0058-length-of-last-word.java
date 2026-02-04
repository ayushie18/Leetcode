class Solution{
    public int lengthOfLastWord(String s){
        int length=0;
        boolean flag=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
            { length++;
            flag=true;}
            else if(flag)
            break;
        }
        return length;
    }
}
// public int lengthOfLastWord(String s) {
//     int i = s.length() - 1;

//     while (i >= 0 && s.charAt(i) == ' ') i--;
//     int length = 0;
//     while (i >= 0 && s.charAt(i) != ' ') {
//         length++;
//         i--;
//     }
//     return length;
// }
