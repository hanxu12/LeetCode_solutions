//242. Valid Anagram, Hash Map, O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            Character s_ch = s.charAt(i);
            if (hmap.containsKey(s_ch)){
                hmap.replace(s_ch, hmap.get(s_ch)+1);
            } else{
                hmap.put(s_ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            Character t_ch = t.charAt(i);
            if (hmap.containsKey(t_ch)){
                hmap.replace(t_ch, hmap.get(t_ch)-1);
            } else{
                return false;
            }
            if (hmap.get(t_ch) < 0){
                return false;
            }
        }
        return true;

    }
}