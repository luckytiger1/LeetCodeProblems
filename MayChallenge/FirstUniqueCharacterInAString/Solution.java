package FirstUniqueCharacterInAString;

import java.util.HashMap;

/*
 387. First Unique Character in a String https://leetcode.com/problems/first-unique-character-in-a-string/

 Given a string, find the first non-repeating character in it and return it's index.
 If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.

 */

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()) {
            hm.put(c,hm.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
