package CheckIfItIsAStraightLine;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        boolean res = s.checkStraightLine(coordinates);
        System.out.println(res);
    }
}
