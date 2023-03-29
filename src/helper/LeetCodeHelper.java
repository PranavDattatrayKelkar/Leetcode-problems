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

}
