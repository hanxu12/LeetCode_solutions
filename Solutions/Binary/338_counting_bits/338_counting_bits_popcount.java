//338. Counting Bits, pop count, O(nk)
class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 0; i < num+1; i++){
        	res[i] = countBits_helper(i);
        }
        return res;
    }
    //implement a popcount, similar to LC. Problem 191
    private int countBits_helper(int input){
    	int cnt = 0;
    	while (input != 0){
    		input = input & (input - 1);
    		cnt++;
    	}
    	return cnt;
    }
}