package RansomNote;

import java.util.ArrayList;

/*
 383. Ransom Note https://leetcode.com/problems/ransom-note/

 Given an arbitrary ransom note string and another string
 containing letters from all the magazines, write a function that
 will return true if the ransom note can be constructed from the magazines ;
 otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Example 1:
 Input: ransomNote = "a", magazine = "b"
 Output: false

*/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> charArr = new ArrayList<>();


        for(char c : magazine.toCharArray()) {
            charArr.add(c);
        }

        for(char ch : ransomNote.toCharArray()) {
            if(charArr.contains(ch)) {
                charArr.remove(charArr.indexOf(ch));
            } else {
                return false;
            }
        }
        return true;
    }
}
