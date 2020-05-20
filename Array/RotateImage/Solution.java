package RotateImage;

/*
 48. Rotate Image https://leetcode.com/problems/rotate-image/

 You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

 Note:

 You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 DO NOT allocate another 2D matrix and do the rotation.

 Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

 */

public class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for(int i = 0; i <= N; i++) {
            for(int j = i; j < N; j++) {
                swap(matrix,i,j);
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N/2; j++) {
                int temp = matrix[i][N - 1 - j];
                matrix[i][N-1-j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private void swap(int[][] arr,int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

}
