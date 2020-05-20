package KthSmallestElementInBST;

import java.util.ArrayList;

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
