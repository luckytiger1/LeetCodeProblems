package CheckIfItIsAStraightLine;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] firstPoint = coordinates[0];
        int[] secondPoint = coordinates[1];

        if(coordinates.length == 2) return true;

        float slope = findSlope(firstPoint,secondPoint);

        for(int i = 1; i < coordinates.length; i++) {
            float slope2 = findSlope(coordinates[i],firstPoint);
            if(slope != slope2) return false;
        }

        return true;
    }

    private float findSlope(int[] point1, int[] point2) {
        if(point2[0] - point1[0] == 0) return 0;
        return (float)(point2[1]-point1[1]/point2[0]-point1[0]);
    }
}
