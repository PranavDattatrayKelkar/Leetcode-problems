package Easy;

import java.util.Stack;

/**
 *  This calss solves Longest Common Prefix problem
 */
public class LongestCommonPrefix {

    /**
     * This method gets the common prefix in between multiple entries of a string array.
     *
     * @param strs
     * @return Common string in between all of the arrays.
     */
    public static String longestCommonPrefix(String[] strs)
    {
        Stack<String> inputStack = new Stack<String>();
        for(String str: strs)
        {
            inputStack.push(str);
        }
        String temp = strs[0];
        while(!inputStack.isEmpty())
        {
            temp  = commonMatch(temp, inputStack.pop());
        }
        return temp;
    }

    /**
     * Returns the common string prefix between two strings.
     *
     * @param initialString
     * @param finalString
     * @return common string
     */
    private static String commonMatch(String initialString, String finalString)
    {
        int len = 0;
        while(len < initialString.length() && len < finalString.length())
        {
            if(initialString.charAt(len) == finalString.charAt(len))
            {
                len++;
            } else
            {
                break;
            }

        }
        return initialString.substring(0, len);
    }

}
