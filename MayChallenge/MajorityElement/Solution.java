package MajorityElement;

/*
 169. Majority Element https://leetcode.com/problems/majority-element/

 Given an array of size n, find the majority element.
 The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority
 element always exist in the array.

 Example 2:

 Input: [2,2,1,1,1,2,2]
 Output: 2
 */

public class Solution {
    public int majorityElement(int[] nums) {
        // Boyer–Moore majority vote algorithm
        int count = 0;
        Integer majorElem = null;
        for(int num : nums) {
            if (count == 0) majorElem = num;
            count += (num == majorElem) ? 1 : -1;
        }
        return majorElem;
    }
}
