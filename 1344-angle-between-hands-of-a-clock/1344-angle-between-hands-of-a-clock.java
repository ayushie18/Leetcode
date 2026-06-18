class Solution {
    public double angleClock(int hour, int minutes) {
        double deg=Math.abs(30*hour - 5.5*minutes);
        if(deg<=180) return deg;
        return(360-deg);

        
    }
}