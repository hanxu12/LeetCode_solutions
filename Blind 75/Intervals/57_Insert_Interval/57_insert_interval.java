//57. Insert Interval, 1 Pass, O(n)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval){
		List<int[]> res= new ArrayList<>();

		for (int[] interval: intervals){
			//if new interval is larger than current interval, then just add the interval
			if (newInterval == null || interval[1] < newInterval[0]){
				res.add(interval);
			}
			//else if newInterval is smaller than current interval, then add newInterval
			else if (newInterval[1] < interval[0]) {
				res.add(newInterval);
				newInterval = null;
				res.add(interval);
			}//merge cases 
			else{
				newInterval[0] = Math.min(newInterval[0], interval[0]);
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			}
		}
		
		if (newInterval == null) {
			return res.toArray(new int[res.size()][]);
		}
		//if newInterval has not been added (larger than all "intervals"), add it at last
		res.add(newInterval);
		return res.toArray(new int[res.size()][]);
	}
}