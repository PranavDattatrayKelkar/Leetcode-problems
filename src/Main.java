import Easy.MergeTwoSortedLists;
import Easy.ValidParentheses;
import Hard.MinimumWindowSubstring;
import Easy.PalindromeNumber;
import Easy.LongestCommonPrefix;
import helper.LeetCodeHelper;

import java.util.*;

import static Easy.FindTheIndexOfTheFirstOccurenceInAString.returnFirstOccurenceIndex;
import static Easy.movingInAdirection.removeUnnecessaryMovements;
import static Medium.minNumOfUniqueIdAfterRemovingMItems.minNumOfUniqueIdAfterRemovingMItems;

public class Main {
    public static void main(String[] args) {
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
         * 76. Minimum window substring
         *
         * This solution is exceeding timelimit in leetcode but is easier to understand in the next commit I will update
         * the solution using hashing
         */
        /*
        String originalString = "bdeacb";
        String targetString = "ab";
        String origninalString1 = "ADOBECODEBANC";
        String targetString1 = "ABC";
        String mininmumWindoSubstring = MinimumWindowSubstring.getMininmumWindoSubstring(origninalString1, targetString1);
        System.out.println(mininmumWindoSubstring);
        */

        /**
         * 9. Palindrome Number
         *
         */
        /*
        int x = 1;
        Boolean bool = PalindromeNumber.palindromeNumberCheck(x);
        System.out.println(bool);
         */


        /**
         * 14. Longest Common Prefix
         *
         *
         **/
        /*
        String[] strs1 = {"aaa","aa","aaa"};
        String[] strs2 = {"dog","racecar","car"};
        String commonPrefix = LongestCommonPrefix.longestCommonPrefix(strs1);
        System.out.println(commonPrefix);
        */

        /**
         * 21. Merge Two Sorted Lists
         */
        /*
        int[] l1 = {1,2,4};
        int[] l2 = {1,3,4};
        Iterator it1 = Arrays.stream(l1).iterator();
        Iterator it2 = Arrays.stream(l2).iterator();
        LeetCodeHelper.ListNode ll1 = new LeetCodeHelper.ListNode();
        LeetCodeHelper.ListNode ll1Head = ll1;
        LeetCodeHelper.ListNode ll2 = new LeetCodeHelper.ListNode();
        LeetCodeHelper.ListNode ll2Head = ll2;
        while(it1.hasNext())
        {
            int val = (int) it1.next();
            ll1.next = new LeetCodeHelper.ListNode(val);
            ll1 = ll1.next;

        }
        while(it2.hasNext())
        {
            int val = (int) it2.next();
            ll2.next = new LeetCodeHelper.ListNode(val);
            ll2 = ll2.next;

        }
        LeetCodeHelper.ListNode finalList = MergeTwoSortedLists.mergeTwoLists(ll1Head.next, ll2Head.next);
        */

        /**
         * 28. Find the Index of the First Occurence in a String
         *
         */
        /*
         String haystack = "sadbutsad";
         String needle = "sad";
         Integer index = returnFirstOccurenceIndex(haystack, needle);
         */

        /**
         * https://leetcode.com/discuss/interview-question/916920/Expedia-OA
         *
         */
        /*
        int[] arr = {4, 1, 4, 4, 5};
        int m = 2;
        int minLength = minNumOfUniqueIdAfterRemovingMItems(arr, m);
        System.out.println(minLength);
        */

        /**
         * Remove unnecessary movements
         *
         */
        /*
        String path1 = "UUDD";
        String path2 = "URDR";

        int numOfUnnecessaryMovements = removeUnnecessaryMovements(path1);
        System.out.println(numOfUnnecessaryMovements);
         */

        /**
         * Pairs of Songs With Total Durations Divisible by 60
         *
         */



    }
}