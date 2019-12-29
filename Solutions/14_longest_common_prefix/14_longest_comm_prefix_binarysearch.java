//14. Longest Common Prefix, binary search method, O(S*logn)
public String longestCommonPrefix(String[] strs) {
	if (strs == null || strs.length == 0){
		return "";
	}
	//find min length 
	int minLen = strs[0].length();
	for (String str : strs){
		minLen = Math.min(minLen, str.length());
	}
	//default low & high
	int low = 1;
	int high = minLen;

	//binary search loop
	while (low <= high){
		int middle = (low + high)/2;
		if (isCommonPrefix(strs, middle)){
			low = middle + 1;
		}
		else {
			high = middle - 1;
		}
	}
	return strs[0].substring(0, (low + high) / 2);
}


private boolean isCommonPrefix(String[] strs ,int len){
	String str1 = strs[0].substring(0, len);
	for (String s: strs){
		if (!s.startsWith(str1)){
			return false;
		}
	}
	return true;
}