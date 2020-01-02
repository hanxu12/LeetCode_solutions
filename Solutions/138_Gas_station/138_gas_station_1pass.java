//134. Gas Station, One pass(greedy?), O(n)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int total_tank = 0;
        int curr_tank = 0;
        int starting_stn = 0;

        for (int i = 0; i < n; i++){
        	total_tank += gas[i] - cost[i];
        	curr_tank += gas[i] - cost[i];
        	//if curr tank < 0, make i+1 a new starting pt
        	//reset curr tank == 0
        	if (curr_tank < 0){
        		starting_stn = i + 1;
        		curr_tank = 0;
        	}
        }
        //if the total tank >= 0, meaning it can carry out the travel
        if (total_tank >= 0){
        	return starting_stn;
        }
        //otherwise failed
        return -1;
    }
}