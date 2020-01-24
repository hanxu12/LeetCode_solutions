//435. Non-overlapping Intervals, sort & greedy, O(nlogn)
public int eraseOverlapIntervals(int[][] intervals) {

		if (intervals == null || intervals.length == 0){
			return 0;
		}

		//sort by end time
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
		List<int[]> nonOverlapping = new ArrayList<>();

		for (int i = 0; i < intervals.length; i++){
			if (nonOverlapping.size == 0){
				nonOverlapping.add(intervals[0]);
			}
			else{
				int[] prev = nonOverlapping.get(nonOverlapping.size() - 1);
				int[] curr = intervals[i];

				if (curr[0] >= prev[1]){
					nonOverlapping.add(current);
				}
			}
		}
		return intervals.length - nonOverlapping.size();

}