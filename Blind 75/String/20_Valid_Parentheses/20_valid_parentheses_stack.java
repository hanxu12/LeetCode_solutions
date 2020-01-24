//20. Valid Parentheses, stack, O(n)
class Solution {
	public boolean isValid(String s){
        	//initialize a stack to be used in the algorithm
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<>();;
		map.put(')','(');
		map.put('}','{');
		map.put(']','[');
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//if an open bracket, push it
			if (map.containsValue(c)){
				stack.push(c);
			} //else a closing bracket 
			else {
				//need to check if empty 1st 
				//b/c if it is empty, stack.peek leads to runtime error
				if (stack.isEmpty() || stack.peek() != map.get(c)){
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}