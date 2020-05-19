package RansomNote;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String ransomNote = "afa", magazine = "aabf";
        boolean res = s.canConstruct(ransomNote,magazine);
        System.out.println(res);
    }
}
