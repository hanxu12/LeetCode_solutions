//253. Meeting Rooms II, Priority Queue(minHeap), O(NlogN)
class Solution {
    public int minMeetingRooms(int[][] intervals) {
    	//edge case
        if (intervals.length < 1) {
        	return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Arrays.sort(intervals, (int[]a, int[] b) -> (a[0] - b[0]));
        minHeap.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++){
        	if (intervals[i][0] >= minHeap.peek()) {
        		minHeap.poll();
        	}
        	minHeap.add(intervals[i][1]);
        }
        return minHeap.size();
    }
}