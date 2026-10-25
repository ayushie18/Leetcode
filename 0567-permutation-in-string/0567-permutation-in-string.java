class Solution {
    public boolean matches(int[] freq1,int[] freq2){
      for(int i=0;i<26;i++){
        if(freq1[i]!=freq2[i]) return false;
      }
      return true;
    }
  public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        // Agar s1 s2 se badi hai, toh permutation milna impossible hai
        if (n1 > n2) return false;

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // 1. Pehli window (length = s1.length()) ke frequencies count karo
        for (int i = 0; i < n1; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }

        // Pehli window check karo
        if (matches(s1Freq, windowFreq)) return true;

        // 2. Window ko slide karo (i = n1 se n2 - 1 tak)
        for (int i = n1; i < n2; i++) {
            // Naya character add karo (Right side expand)
            windowFreq[s2.charAt(i) - 'a']++;
            
            // Purana character hatao (Left side shrink)
            windowFreq[s2.charAt(i - n1) - 'a']--;

            // Check karo kya frequencies match hui
            if (matches(s1Freq, windowFreq)) return true;
        }

        return false;
    }
}