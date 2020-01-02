//191. Number of 1 Bits, getBit, O(1)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int cnt = 0;
        for (int i = 0; i < 32; i++){
        	if (getBit(n, i)){
        		cnt++;
        	}
        }
        return cnt;
    }

    private boolean getBit(int n, int bit){
    	return (n & (1 << bit)) != 0;
    }
}