package JewelsAndStones;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String J = "aA";
        String S = "aAAbbbb";
        int res = s.numJewelsInStones(J,S);
        System.out.println(res);
    }
}
