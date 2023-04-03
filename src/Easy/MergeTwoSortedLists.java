package Easy;

import helper.LeetCodeHelper.ListNode;

import java.util.Objects;

/**
 * This class solves Merge Two Sorted Lists leetcode problem.
 *
 */
public class MergeTwoSortedLists {

    /**
     * This method merges two lists and gets a final sorted list
     *
     * @param l1
     * @param l2
     * @return returns merged sorted list for both of the listNodes
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode finalMergedList = new ListNode();
        ListNode head = finalMergedList;
        int minimum1 = Integer.MAX_VALUE;
        int minimum2 = Integer.MAX_VALUE;
        while(Objects.nonNull(l1) || Objects.nonNull(l2))
        {
            int small = 0;
            if(Objects.nonNull(l1))
            {
                minimum1 = l1.val;
            }
            if(Objects.nonNull(l2))
            {
                minimum2 = l2.val;
            }
            if(minimum1 > minimum2)
            {
                small = minimum2;
                l2 = l2.next;
            } else
            {
                small = minimum1;
                l1 = l1.next;
            }

            head.next = new ListNode(small);
            head = head.next;
            minimum1 = Integer.MAX_VALUE;
            minimum2 = Integer.MAX_VALUE;
        }

        return finalMergedList.next;
    }
}
