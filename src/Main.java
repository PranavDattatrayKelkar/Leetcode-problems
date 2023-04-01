import Easy.TwoSum;
import Medium.AddTwoNumbers;
import Medium.MinimumWindowSubstring;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import static helper.LeetCodeHelper.ListNode;
public class Main {
    public static void main(String[] args)
    {
        /**
         * 1. Two sum
         */
        /*
        int[] finalArr = new int[2];
        int[] input = {3,2,4};
        finalArr = TwoSum.twoSum(input ,6);
        */
        /**
         * 2. Add two numbers
         */
        /*
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
        */

        /**
         * 3. Length Of LongestSubstring
         *
         * This solution is exceeding timelimit in leetcode but is easier to understand in the next commit I will update
         * the solution using hashing
         */
        String originalString = "bdeacb";
        String targetString = "ab";
        String origninalString1 = "ADOBECODEBANC";
        String targetString1 = "ABC";
        String mininmumWindoSubstring = MinimumWindowSubstring.getMininmumWindoSubstring(origninalString1, targetString1);
        System.out.println(mininmumWindoSubstring);


    }
}