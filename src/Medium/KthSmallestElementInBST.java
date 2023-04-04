package Medium;

import java.util.ArrayList;
import helper.LeetCodeHelper.TreeNode;

public class KthSmallestElementInBST {
    private static ArrayList<Integer> inOrderTraverse(TreeNode root, ArrayList<Integer> sortedArray)
    {
        if(root == null) return sortedArray;
        inOrderTraverse(root.left, sortedArray);
        sortedArray.add(root.val);
        inOrderTraverse(root.right, sortedArray);
        return sortedArray;
    }

    public static int kthSmallest(TreeNode root, int k)
    {
        ArrayList<Integer> nums = inOrderTraverse(root, new ArrayList<Integer>());
        return nums.get(k-1);
    }
}
