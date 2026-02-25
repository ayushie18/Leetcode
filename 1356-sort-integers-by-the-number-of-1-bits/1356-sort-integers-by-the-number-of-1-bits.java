class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        
        // Convert int[] to Integer[]
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        
        Arrays.sort(temp, (a, b) -> {
            
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            // First compare by bit count
            if(countA != countB)
                return countA - countB;
            
            // If same bit count, compare normally
            return a - b;
        });
        
        // Convert back to int[]
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        
        return arr;
        
    }
}