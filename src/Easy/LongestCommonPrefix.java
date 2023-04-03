package Easy;

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
        String initialString = strs[0];
        String finalString  = strs[strs.length-1];

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
