/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
class SeatManager {
       PriorityQueue<Integer>minheap;
    public SeatManager(int n) {
         minheap=new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            minheap.add(i);
        }
    }
    
    public int reserve() {
        return minheap.poll();
    }
    
    public void unreserve(int seatNumber) {
        minheap.add(seatNumber);
    }
}

