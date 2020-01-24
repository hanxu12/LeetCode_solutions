//1099. Two Sum Less Than K, Brute Force
class Solution {
    public int twoSumLessThanK(int[] A, int K) {
    	int n = A.length;
    	int S = -1;
        for (int i = 0; i < n; i++) {
        	for (int j = i + 1; j < n; j++) {
        		if (A[i] + A[j] < K) {
        			S = Math.max(S, A[i] + A[j]);
        		}
        	}
        }
        if (S == -1) {
        	return -1;
        }
        return S;
    }
}