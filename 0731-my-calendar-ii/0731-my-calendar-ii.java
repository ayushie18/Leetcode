class MyCalendarTwo {
    List<int[]> bookings;
    List<int[]> overlappingBookings;

    public MyCalendarTwo() {
        bookings=new ArrayList<>();
        overlappingBookings=new ArrayList<>();
        
    }
    public boolean overlap(int[]i1,int s2,int e2){
        if(i1[1]>=s2 && e2>=i1[0]){
            return true;
        }
        return false;
    }

    
    public boolean book(int startTime, int endTime) {
        if(bookings.size()==0){
            bookings.add(new int[]{
                startTime,endTime-1
            });
            return true;
        }
        for(int i=0;i<overlappingBookings.size();i++){
            if(overlap(overlappingBookings.get(i),startTime,endTime-1)){
                return false;
            }
        }
        for(int i=0;i<bookings.size();i++){
            if(overlap(bookings.get(i),startTime,endTime-1)){
                overlappingBookings.add(new int []{
                   Math.max(bookings.get(i)[0],startTime) ,
                   Math.min(bookings.get(i)[1],endTime-1)
                });
            }
        }
        bookings.add(new int[]{
            startTime,endTime-1
        });
         return true;
        
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */