package helper;

/**
 * Helper class for all the utility objects of LeetCode
 *
 */
public final class LeetCodeHelper {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {};
        public ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) {this.val=val; this.next = next;}
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
