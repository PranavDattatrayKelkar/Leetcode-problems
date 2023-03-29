package Medium;

import java.util.Objects;

import static helper.LeetCodeHelper.ListNode;

/**
 * This class solves add two numbers problem
 *
 */
public class AddTwoNumbers {

    /**
     * Addition of two numbers using linked lists
     *
     * @param l1 :Input listNode 1
     * @param l2 :Input listNode 2
     * @return final linked containing the sum of the two input linked lists
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode finalList = new ListNode();
        ListNode head = finalList;
        while(Objects.nonNull(l1) || Objects.nonNull(l2) || carry > 10)
        {
            if(Objects.nonNull(l1))
            {
                sum += l1.val;
                l1 = l1.next;

            }
            if(Objects.nonNull(l2))
            {
                sum += l2.val;
                l2 = l2.next;

            }
            sum += carry;
            carry = sum/10;
            head.next = new ListNode(sum%10);
            head  = head.next;
            sum = 0;

        }
        if(carry != 0)
        {
            head.next = new ListNode(carry);

        }
        return finalList.next;

    }

}
