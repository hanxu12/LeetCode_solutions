//647. Palindromic Substrings, DP, O(n^2)
class Solution {
	public int countSubstrings(String s) {
		int res = 0;
		int n = s.length();
		boolean[][] subStringCheck = new boolean[n][n];
		for (int i = 0; i < n; i++){
			for (int j = i; j >=0; j--){
				if ((s.charAt(i) == s.charAt(j)) && (i-j <= 2 || subStringCheck[i-1][j+1])){
					subStringCheck[i][j] = true;
					res += 1;
				}
			}
		}
		return res;
	}
}