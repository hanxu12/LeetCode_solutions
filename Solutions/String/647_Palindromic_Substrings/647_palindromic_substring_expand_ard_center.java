//647. Palindromic Substrings, Expand around the center, O(n^2)
class Solution {
	public int countSubstrings(String s) {
		int res = 0;
		int n = s.length();

		for (int center = 0; center < 2 * n -1; center++) {
			int left = center/2;
			int right = left + center %2;
			while (left >= 0 && right <= n-1 && s.charAt(left) == s.charAt(right)) {
				res += 1;
				left -= 1;
				right += 1;
			}
		}
		return res;
	}
}