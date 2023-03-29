import Easy.TwoSum;
import Medium.AddTwoNumbers;

import java.util.Arrays;
import java.util.Iterator;

import static helper.LeetCodeHelper.ListNode;
public class Main {
    public static void main(String[] args)
    {
        /**
         * 1. Two sum
         */
        int[] finalArr = new int[2];
        int[] input = {3,2,4};
        finalArr = TwoSum.twoSum(input ,6);

        /**
         * 2. Add two numbers
         */
        int[] l1 = {1,2,3};
        int[] l2 = {2,3,4};
        Iterator it1 = Arrays.stream(l1).iterator();
        Iterator it2 = Arrays.stream(l2).iterator();
        ListNode ll1 = new ListNode();
        ListNode ll1Head = ll1;
        ListNode ll2 = new ListNode();
        ListNode ll2Head = ll2;
        while(it1.hasNext())
        {
            int val = (int) it1.next();
            ll1.next = new ListNode(val);
            ll1 = ll1.next;
        }
        while(it2.hasNext())
        {
            int val = (int) it2.next();
            ll2.next = new ListNode(val);
            ll2 = ll2.next;
        }
        ListNode finalList = AddTwoNumbers.addTwoNumbers(ll1Head.next, ll2Head.next);

        /**
         * 3. Length Of LongestSubstring
         *
         */


    }
}