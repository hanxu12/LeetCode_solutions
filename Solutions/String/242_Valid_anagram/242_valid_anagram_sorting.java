//242. Valid Anagram, Sorting, O(nlogn)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        //convert both to character array        
        char[] s_charArr = s.toCharArray();
        char[] t_charArr = t.toCharArray();
        //sort & check if equals
        Arrays.sort(s_charArr);
        Arrays.sort(t_charArr);
        return Arrays.equals(s_charArr, t_charArr);
    }
}