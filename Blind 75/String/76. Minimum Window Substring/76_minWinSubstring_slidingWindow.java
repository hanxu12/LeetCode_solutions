//76. Minimum Window Substring, sliding window, O(s + t)
class Solution {
  public String minWindow(String s, String t) {
    if (s.length() == 0 || t.length() == 0) {
      return "";
    }

    Map<Character, Integer> dictT = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      dictT.put(ch, dictT.getOrDefault(ch, 0) + 1);
    }
    Map<Character, Integer> winCnt = new HashMap<>();

    int required = dictT.size();
    int l = 0;
    int r = 0;
    int[] ans = {-1, 0, 0};
    int formed = 0;

    while (r < s.length()) {
      char ch = s.charAt(r);
      winCnt.put(ch, winCnt.getOrDefault(ch, 0) + 1);

      if (dictT.containsKey(ch) && winCnt.get(ch).intValue() == dictT.get(ch).intValue()) {
        formed += 1;
      }

      while (l <= r && formed == required) {
        char c = s.charAt(l);

        if (ans[0] == -1 || r - l + 1 < ans[0]) {
          ans[0] = r - l + 1;
          ans[1] = l;
          ans[2] = r;
        }

        l += 1;
        winCnt.put(c, winCnt.get(c) - 1);
        if (dictT.containsKey(c) && winCnt.get(c).intValue() < dictT.get(c).intValue()) {
          formed--;
        }
      }
      r += 1;
    }
    return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
  }
}