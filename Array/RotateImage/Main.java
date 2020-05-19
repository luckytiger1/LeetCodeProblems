package RotateImage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int matrix[][] = {{5, 1, 9, 11}, { 2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        s.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
