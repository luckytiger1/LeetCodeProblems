package KthSmallestElementInBST;

import java.util.ArrayList;

/*
230. Kth Smallest Element in a BST https://leetcode.com/problems/kth-smallest-element-in-a-bst/

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1

 */

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        inOrder(root,nums,k);
        return nums.get(k - 1);
    }

    public void inOrder(TreeNode root, ArrayList nums, int k) {
        if(root == null) {
            return;
        }

        inOrder(root.left,nums,k);
        nums.add(root.val);
        inOrder(root.right,nums,k);
    }
}
