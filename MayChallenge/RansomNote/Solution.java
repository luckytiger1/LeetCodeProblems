package RansomNote;

import java.util.ArrayList;

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
