//125. Valid Palindrome, Stack , O(n)
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int validChar_cnt = 0;
        int validChar_i = 0;
        Stack<Character> stack = new Stack<>();
        if (n < 2){
        	return true;
        }
        //iterate and determine valid no. of chars
        for (int i = 0; i < n; i++){
        	if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)) ){
        		validChar_cnt += 1;
        	}
        }
        if (validChar_cnt < 2){
        	return true;
        }
        //int mid_pt = ((validChar_cnt % 2) == 1) ? validChar_cnt/2+1:validChar_cnt/2; 

        //reiterate
        for (int i = 0; i < n; i++){
        	
        	Character ch = s.charAt(i);

        	if (!Character.isLetter(ch) && !Character.isDigit(ch)){
        		continue;
        	} else{
        		validChar_i += 1;
        		if (validChar_i <= validChar_cnt/2){
        			stack.push(ch);
        		}//else if odd && 
        		else if ((validChar_cnt % 2 == 1) && (validChar_i == validChar_cnt/2+1)){
        			continue;
        		} else{
        		if (stack.isEmpty() || !checkEqual(stack.pop(), ch)){
        			return false;
        		}
        		}
        	}

        }
        return stack.isEmpty();
    }
    //checkEqual helper method
    private boolean checkEqual(Character c1, Character c2){
    	if (Character.isDigit(c1) && Character.isDigit(c2)){
    		return Character.equals(c1, c2);
    	}
    	else if (Character.isLetter(c1) && Character.isLetter(c2)){
    		if (Math.abs(c1 - c2) == 0 || Math.abs(c1 - c2) == 32){
    		return true;    		
    		}
    	}
    	return false;
    }
}