//125. Valid Palindrome, left + right pointer, O(n)
class Solution {
    public boolean isPalindrome(String s) {
    	String new_str = "";

    	for (char c: s.toCharArray()) {
    		if (Character.isDigit(c) || Character.isLetter(c)) {
    			new_str += c;
    		}
    	}

    	new_str = new_str.toLowerCase();

    	int left = 0;
    	int right = new_str.length() - 1;

    	while (left <= right) {
    		if (new_str.charAt(left) != new_str.charAt(right)) {
    			return false;
    		}
    		left += 1;
    		right -= 1;
    	}
    	return true;
    }
}