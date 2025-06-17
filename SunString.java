
import java .util.HashMap;
class SubsString{
public int lengthOfLongestSubstring(String s) {
    int maxLen = 0, start = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int end = 0; end < s.length(); end++) {
        char c = s.charAt(end);
        if (map.containsKey(c)) {
            start = Math.max(start, map.get(c) + 1);
        }
        map.put(c, end);
        maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
}
}