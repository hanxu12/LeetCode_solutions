//252. Meeting Rooms, Brute force, O(n^2)
class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
    	int n = intervals.length;
        for (int i = 0; i < n - 1; i++){
        	for (int j = i+1; j < n; j++){
        		if (checkOverlap(intervals[i], intervals[j])) {
        			return false;
        		}
        	}
        }
        return true;
    }
//A smarter way to check if overlaps
    private boolean checkOverlap(int[] i1, int[] i2){
    	if (Math.min(i1[1], i2[1]) > Math.max(i1[0], i2[0])){
    		return true;
    	}
    	return false;
    }
 //normal way, but still shld look at it
/*
    private boolean checkOverlap(int[] i1, int[] i2){
    	if ((i1[0] >= i2[0] && i1[0] < i2[1]) || (i2[0] >= i1[0] && i2[0] < i1[1])){
    		return true;
    	}
    	return false;
    }
    */
}