//253. Meeting Rooms II, minheap(PQ), O(nlogn) 
class Solution {
    public int minMeetingRooms(int[][] intervals) {
    	int n = intervals.length;
    	//edge cases
    	if (intervals == null || n < 2){
    		return 0;
    	}
    	//init
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        PriorityQueue<Integer> allocator = new PriorityQueue<>();
        allocator.add(intervals[0][1]);
        //iterate thru the array 
        for (int i = 1; i < n; i++){
        	//if the new interval's start time >= last's end time, release the last interval
        	if (intervals[i][0] >= allocator.peek()){
        		allocator.poll();
        	}
        	//add the latest interval
        	allocator.add(intervals[i][1]);
        } 
        return allocator.size();
    }
}