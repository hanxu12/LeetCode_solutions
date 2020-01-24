//125. Valid Palindrome, (better written) stack, O(n)
class Solution {
    public boolean isPalindrome(String s) {
    	String new_str = "";

    	for (char c: s.toCharArray()) {
    		if (Character.isDigit(c) || Character.isLetter(c)) {
    			new_str += c;
    		}
    	}

    	new_str = new_str.toLowerCase();
    	Stack<Character> cache= new Stack<>();
    	int n = new_str.length();
    	for (int i = 0; i < n; i++){
    		if (i < n/2){	
    			cache.push(new_str.charAt(i));
    		} else if ((n % 2 == 1) && (i == n/2)){
    			continue;
    		} else{
    			if (cache.isEmpty() || cache.peek() != new_str.charAt(i)){
    				return false;
    			}
    			cache.pop();
    		}
    	}
    	return cache.isEmpty();

    }
}