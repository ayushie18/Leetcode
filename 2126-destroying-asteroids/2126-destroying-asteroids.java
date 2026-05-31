class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long currMass=mass;
        Arrays.sort(asteroids);

        for(int ele:asteroids){
            if(ele>currMass){
                return false;
            }
            currMass+=ele;
        }
        return true;

        
    }
}