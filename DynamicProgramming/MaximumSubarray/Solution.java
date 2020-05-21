package MaximumSubarray;

/* 53. Maximum Subarray https://leetcode.com/problems/maximum-subarray/
* Given an integer array nums, find the contiguous subarray
* (containing at least one number) which has the largest sum and return its sum.
*
* Input: [-2,1,-3,4,-1,2,1,-5,4],
* Output: 6
* Explanation: [4,-1,2,1] has the largest sum = 6.
*
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int bestMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            currMax = nums[i] + Math.max(0,currMax);
            bestMax = Math.max(bestMax,currMax);
        }
        return bestMax;
    }
}
