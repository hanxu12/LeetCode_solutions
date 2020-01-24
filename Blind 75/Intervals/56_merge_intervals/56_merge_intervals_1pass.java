//56. Merge Intervals, One pass, O(n), solution from Nick White
class Solution {
    public int[][] merge(int[][] intervals) {
    	int n = intervals.length;
    	//edge case
    	if (n <= 1){
    		return intervals;
    	}
    	Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
    	//store all intervals inside an arraylist at first
    	List<int[]> res = new ArrayList();
    	int[] curr_interval = intervals[0];
    	res.add(curr_interval);

    	for (int[] interval: intervals){
    		int curr_begin = curr_interval[0];
    		int curr_end = curr_interval[1];
    		int next_begin = interval[0]; 
    		int next_end = interval[1];
    		//if curr and next intervals overlap
    		if (curr_end >= next_begin){
    			curr_interval[1] = Math.max(curr_end, next_end);
    		} else{
    			curr_interval = interval;
    			res.add(curr_interval);
    		}

    	}
    	return res.toArray(new int[res.size()][]);
    }
}