//57. Insert Interval, 1 Pass, O(n)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for (int[] i: intervals) {
        	if (newInterval == null || i[1] < newInterval[0]){
        		res.add(i);
        	} else if (newInterval[1] < i[0]) {
        		res.add(newInterval);
        		newInterval = null;
        		res.add(i);
        	} else{
        		newInterval[0] = Math.min(newInterval[0], i[0]);
        		newInterval[1] = Math.max(newInterval[1], i[1]);
        	}
        }
        if (newInterval == null) return res.toArray(new int[res.size()][]);
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}