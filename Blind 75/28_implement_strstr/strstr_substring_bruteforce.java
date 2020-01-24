//28. strStr(), brute force - substring method
class Solution {
    public int strStr(String haystack, String needle) {
        int haystack_len = haystack.length();
        int needle_len = needle.length();
        for (int i = 0; i < haystack_len - needle_len + 1; i++){
        	if (haystack.substring(i, i+needle_len).equals(needle)){
        		return i;
        	}
        }
        return -1;
    }
}

